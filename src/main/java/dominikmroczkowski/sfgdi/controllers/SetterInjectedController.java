package dominikmroczkowski.sfgdi.controllers;

import org.springframework.stereotype.Controller;

import dominikmroczkowski.sfgdi.services.GreetingService;

public class SetterInjectedController {

	private GreetingService greetingService;

	public GreetingService getGreetingService() {
		return greetingService;
	}

	public void setGreetingService(GreetingService greetingService) {
		this.greetingService = greetingService;
	}
}
