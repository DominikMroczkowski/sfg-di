package dominikmroczkowski.sfgdi.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {
	public MyController() {}

	public String sayHello() {
		System.out.println("Hello world!");

		return "";
	}
}
