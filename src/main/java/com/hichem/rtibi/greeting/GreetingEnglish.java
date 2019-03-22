package com.hichem.rtibi.greeting;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("english")
public class GreetingEnglish implements GreetingService {

	@Override
	public String sayHello(String name) {
		// TODO Auto-generated method stub
		return "hello " + name;
	}

}
