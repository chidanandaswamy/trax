package com.trax.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.trax.entities.Lead;
import com.trax.service.LeadService;

@Controller
public class LeadController {
	
	@Autowired
	private LeadService leadService;
	
	@RequestMapping("/newLead")
	public String getLead() {
		return "new_lead";
	}
	
	@RequestMapping("/saveLead")
	public String saveLead(@ModelAttribute Lead lead, ModelMap model) {
		try {
			leadService.saveLead(lead);
			model.addAttribute("lead", lead);
			return "lead_info";
		} catch (Exception e) {
			model.addAttribute("error", "Email Already Exists!");
			return "new_lead";
		}
	}
	
	@RequestMapping("/listOfLeads")
	public String listAllLeads(ModelMap model) {
		List<Lead> leads = leadService.listAll();
		model.addAttribute("leads", leads);
		return "list_of_leads";
	}
	
	@RequestMapping(value = "leadInfo")
	public String getInfo(@RequestParam("id") long id, ModelMap model) {
		Lead lead = leadService.findById(id);
		model.addAttribute("lead", lead);
		return "lead_info";
	}
	
}
