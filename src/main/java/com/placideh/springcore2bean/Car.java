package com.placideh.springcore2bean;

import org.springframework.stereotype.Component;

@Component
public class Car  implements Vehicle{
	
	public void drive() {
		System.out.println("We are driving a car!");
	}
}
