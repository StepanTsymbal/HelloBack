package com.styopik.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
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

	@RequestMapping(value = "/contacts", method = RequestMethod.GET)
	public WebAsyncTask<List<Contacts>> handleTestRequest(@RequestParam("nameFilter") String nameFilter) {

		List<Contacts> filteredContacts = new ArrayList<Contacts>();

		Callable<List<Contacts>> callable = new Callable<List<Contacts>>() {

			@Override
			public List<Contacts> call() throws InterruptedException {

				for (Contacts contact : contactsRepository.findAll()) {
					Pattern pattern = Pattern.compile(nameFilter);
					Matcher matcher = pattern.matcher(contact.getName());

					if (!matcher.matches()) {
						filteredContacts.add(contact);
					}
				}

				return filteredContacts;

			}
		};

		return new WebAsyncTask<List<Contacts>>(callable);
	}
}