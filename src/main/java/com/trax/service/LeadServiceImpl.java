package com.trax.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trax.entities.Lead;
import com.trax.repositories.LeadRepositories;

@Service
public class LeadServiceImpl implements LeadService{

	@Autowired
	private LeadRepositories leadRepo;
	
	@Override
	public void saveLead(Lead lead) {
		leadRepo.save(lead);
	}

	@Override
	public Lead findById(long id) {
		Optional<Lead> findById = leadRepo.findById(id);
		Lead lead = findById.get();
		return lead;
	}

	@Override
	public void deleteById(long id) {
		leadRepo.deleteById(id);
	}

	@Override
	public List<Lead> listAll() {
		List<Lead> leads = leadRepo.findAll();
		return leads;
	}

}
