package com.styopik.repository;

import static org.hibernate.jpa.QueryHints.HINT_FETCH_SIZE;

import java.util.List;

import javax.persistence.QueryHint;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.QueryHints;

import com.styopik.models.Contacts;

public interface ContactsRepository extends JpaRepository<Contacts, Integer> {

	@QueryHints(value = @QueryHint(name = HINT_FETCH_SIZE, value = "" + 5000))
	List<Contacts> findAll();
}