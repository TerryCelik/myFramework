package com.herokuapp.main;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterAll;

import com.herokuapp.BaseTest;

public class mainPageTest extends BaseTest {

	@BeforeAll
	public void beforeAll() {
		mainPage.openPage();
		}
	
	@Test
	public void asd() {
		mainPage.clickSomeButton();
	}
	
	@AfterAll
	public void AfterAll() {
		
	}


}
