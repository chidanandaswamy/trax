package com.trax.service;

import java.util.List;

import com.trax.entities.Lead;

public interface LeadService {

	public void saveLead(Lead lead);

	public Lead findById(long id);

	public void deleteById(long id);
	
	public List<Lead> listAll();

}
