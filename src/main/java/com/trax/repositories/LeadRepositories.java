package com.trax.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trax.entities.Lead;

public interface LeadRepositories extends JpaRepository<Lead, Long> {

}
