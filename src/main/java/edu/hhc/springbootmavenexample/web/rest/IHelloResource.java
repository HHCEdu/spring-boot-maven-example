package edu.hhc.springbootmavenexample.web.rest;

import org.springframework.web.bind.annotation.GetMapping;

public interface IHelloResource {
	@GetMapping(value = "/hello", produces = "text/plain")
	String greet();
}
