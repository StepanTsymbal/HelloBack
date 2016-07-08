package com.styopik;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabase;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.styopik.controllers.ContactsController;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = DbConnectorApplication.class)
@WebAppConfiguration
@ActiveProfiles("h2")
public class DbConnectorApplicationTests {

	private EmbeddedDatabase db;

	@Autowired
	ContactsController contactsController;

	private MockMvc mockMvc;

	@Before
	public void setUp() {

		this.mockMvc = MockMvcBuilders.standaloneSetup(contactsController).build();

		db = new EmbeddedDatabaseBuilder().setType(EmbeddedDatabaseType.H2).addScript("db/sql/create-db.sql")
				.addScript("db/sql/insert-data.sql").build();
	}

	@Test
	public void filterTest() throws Exception {

		mockMvc.perform(get("/hello/contacts?nameFilter=^A.*$")).andExpect(status().is(404));
	}

	@Test
	public void wrongFilterTest() throws Exception {

		mockMvc.perform(get("/hello/contacts?wrongFilterName=^A.*$")).andExpect(status().is(400));
	}

	@After
	public void tearDown() {
		db.shutdown();
	}

}
