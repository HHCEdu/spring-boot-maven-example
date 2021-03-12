package edu.hhc.springbootmavenexample.web.rest.impl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.hhc.springbootmavenexample.web.rest.IHelloResource;

@RestController
@RequestMapping("api")
public class HelloResource implements IHelloResource {

	@Override
	public String greet() {
		return "Hello";
	}

}
