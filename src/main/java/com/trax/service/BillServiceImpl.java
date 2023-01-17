package com.trax.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trax.entities.Bill;
import com.trax.repositories.BillRepositories;

@Service
public class BillServiceImpl implements BillService {

	@Autowired
	private BillRepositories billRepo;
	
	@Override
	public void saveBill(Bill bill) {
		billRepo.save(bill);
	}

}
