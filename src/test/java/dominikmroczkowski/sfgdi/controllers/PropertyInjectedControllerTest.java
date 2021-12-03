package dominikmroczkowski.sfgdi.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import dominikmroczkowski.sfgdi.services.GreetingServiceImpl;

@SpringBootTest
class PropertyInjectedControllerTest {

	PropertyInjectedController controller;

	@BeforeEach
	void setUp() {
		controller = new PropertyInjectedController();
		controller.greetingService = new GreetingServiceImpl();
	}

	@Test
	void getGreeting() {
		System.out.println(controller.greetingService.getGreeting());
	}
}
