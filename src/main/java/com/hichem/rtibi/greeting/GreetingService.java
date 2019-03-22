package com.hichem.rtibi.greeting;

import org.springframework.stereotype.Component;

@Component
public interface GreetingService {
	public String sayHello(String name);

}
