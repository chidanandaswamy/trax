package com.trax.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.trax.entities.Contact;

@Service
public interface ContactService {

	public void saveContact(Contact contact);

	public List<Contact> listAll();

	public Contact findById(long id);
}
