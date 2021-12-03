package dominikmroczkowski.sfgdi.controllers;

import org.springframework.stereotype.Controller;

import dominikmroczkowski.sfgdi.services.GreetingService;

public class ConstructorInjectedController {

	public ConstructorInjectedController(GreetingService greetingService) {
		this.greetingService = greetingService;
	}

	private final GreetingService greetingService;

	public String getGreeting() {
		return greetingService.getGreeting();
	}

}
