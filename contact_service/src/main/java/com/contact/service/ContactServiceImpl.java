package com.contact.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.contact.entity.Contact;

@Service
public class ContactServiceImpl implements ContactService {
	
	List<Contact> list = List.of(new Contact(1L, "amit@gmail.com","Amit", 1310L), 
			new Contact(2L, "anil@gmail.com", "anil", 1311L),
			new Contact(3L, "rohan@gmail.com", "Rohan", 1312L),
			new Contact(4L, "sameer@gmail.com", "Sameer", 1313L));

	@Override
	public List<Contact> getContactOfUser(Long userId) {
		
		return list.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
	}

}
