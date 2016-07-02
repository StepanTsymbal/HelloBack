package com.styopik.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.async.WebAsyncTask;

import com.styopik.models.Contacts;
import com.styopik.repository.ContactsRepository;

@RestController
@RequestMapping("/hello")
public class ContactsController {

	@Autowired
	ContactsRepository contactsRepository;

	@RequestMapping(value = "/contacts", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON)
	// public WebAsyncTask<List<Contacts>>
	// handleTestRequest(@RequestParam("nameFilter") String nameFilter) {
	public WebAsyncTask<ResponseEntity<List<Contacts>>> handleTestRequest(
			@RequestParam("nameFilter") String nameFilter) {

		List<Contacts> filteredContacts = new ArrayList<Contacts>();

		// Callable<List<Contacts>> callable = new Callable<List<Contacts>>() {
		Callable<ResponseEntity<List<Contacts>>> callable = new Callable<ResponseEntity<List<Contacts>>>() {

			@Override
			// public List<Contacts> call() throws InterruptedException {
			public ResponseEntity<List<Contacts>> call() throws InterruptedException {

				for (Contacts contact : contactsRepository.findAll()) {
					Pattern pattern = Pattern.compile(nameFilter);
					Matcher matcher = pattern.matcher(contact.getName());

					if (!matcher.matches()) {
						filteredContacts.add(contact);
					}
				}

				if (filteredContacts.isEmpty()) {
					return new ResponseEntity<List<Contacts>>(filteredContacts, HttpStatus.NOT_FOUND);
				}

				// return filteredContacts;
				return new ResponseEntity<List<Contacts>>(filteredContacts, HttpStatus.OK);
			}
		};

		// return new WebAsyncTask<List<Contacts>>(callable);
		return new WebAsyncTask<ResponseEntity<List<Contacts>>>(callable);
	}
}