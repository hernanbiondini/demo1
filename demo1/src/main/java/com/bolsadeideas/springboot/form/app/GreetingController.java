package com.bolsadeideas.springboot.form.app;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="greeting")
public class GreetingController {

	private final AtomicLong counter = new AtomicLong();
	private static final String template = "Hola %s";
	
	@GetMapping
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "Mundo")String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}
}
