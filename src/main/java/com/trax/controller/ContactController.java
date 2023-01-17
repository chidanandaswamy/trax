package com.trax.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.trax.entities.Contact;
import com.trax.entities.Lead;
import com.trax.service.ContactService;
import com.trax.service.LeadService;

@Controller
public class ContactController {
	
	@Autowired
	private ContactService contactService;
	
	@Autowired
	private LeadService leadService;
	
	@RequestMapping("/convert")
	public String convertLead(@RequestParam("id") long id, ModelMap model) {
		try {
			Lead lead = leadService.findById(id);
			
			Contact contact = new Contact();
			
			contact.setFirstName(lead.getFirstName());
			contact.setLastName(lead.getLastName());
			contact.setLeadSource(lead.getLeadSource());
			contact.setEmail(lead.getEmail());
			contact.setNumber(lead.getNumber());
			
			contactService.saveContact(contact);
			
			leadService.deleteById(id);
			
			List<Contact> contacts = contactService.listAll();
			model.addAttribute("contacts", contacts);
		} catch (Exception e) {
			leadService.deleteById(id);
			
			List<Contact> contacts = contactService.listAll();
			model.addAttribute("contacts", contacts);
		}
		return "list_of_contacts";
	}
	
	@RequestMapping("contactInfo")
	public String getInfo(@RequestParam("id") long id, ModelMap model) {
		Contact contact = contactService.findById(id);
		model.addAttribute("contact", contact);
		return "contact_info";
	}
	
	@RequestMapping("listOfContacts")
	public String listAllContacts(ModelMap model) {
		List<Contact> contacts = contactService.listAll();
		model.addAttribute("contacts", contacts);
		return "list_of_contacts";
	}
}
