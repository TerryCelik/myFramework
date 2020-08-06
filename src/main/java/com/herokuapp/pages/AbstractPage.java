package com.herokuapp.pages;

import org.springframework.beans.factory.annotation.Autowired;

import com.herokuapp.configuration.DriverFunctions;

public abstract class AbstractPage {

	@Autowired
	protected DriverFunctions driver;
	
	abstract void openPage();
	
}
