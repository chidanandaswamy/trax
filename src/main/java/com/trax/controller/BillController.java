package com.trax.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.trax.entities.Bill;
import com.trax.entities.Contact;
import com.trax.service.BillService;
import com.trax.service.ContactService;

@Controller
public class BillController {
	
	@Autowired
	private ContactService contactService;
	
	@Autowired
	private BillService billService;
	
	@RequestMapping(value="/billing",method = RequestMethod.GET)
	public String billing(@RequestParam("id") long id,ModelMap model) {
	Contact contact = contactService.findById(id);
	model.addAttribute("contact", contact);
	return "create_bill";
	}
	
	@RequestMapping(value="/generateBill",method = RequestMethod.POST)
	public String generateBill(@ModelAttribute Bill bill, ModelMap model) {
		billService.saveBill(bill);
		model.addAttribute("bill", bill);
		return "print_bill";
	}
}
