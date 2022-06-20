package com.trax.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trax.entities.Bill;

public interface BillRepositories extends JpaRepository<Bill, Long> {

}
