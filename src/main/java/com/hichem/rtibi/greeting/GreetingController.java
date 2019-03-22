package com.hichem.rtibi.greeting;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/")
public class GreetingController {
	@Autowired
	private GreetingService greetingServices;

	@RequestMapping("hello/{name}")
	public String hello(@PathVariable(value="name")String name) {
		return greetingServices.sayHello(name);

	}

}
