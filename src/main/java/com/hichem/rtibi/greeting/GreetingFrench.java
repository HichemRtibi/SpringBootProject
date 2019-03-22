package com.hichem.rtibi.greeting;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("french")
public class GreetingFrench implements GreetingService {

	@Override
	public String sayHello(String name) {
		// TODO Auto-generated method stub
		return "Bonjour " + name;
	}

}
