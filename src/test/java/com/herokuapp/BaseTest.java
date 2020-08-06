package com.herokuapp;

import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.herokuapp.configuration.AppConfig;
import com.herokuapp.pages.MainPage;

@ContextConfiguration(classes= {AppConfig.class})
@ExtendWith({SpringExtension.class})
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public abstract class BaseTest {
	
	@Autowired
	protected Environment env;
	
	@Autowired
	protected MainPage mainPage;

}
