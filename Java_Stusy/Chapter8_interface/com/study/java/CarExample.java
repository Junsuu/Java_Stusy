package com.study.java;

public class CarExample {
	
	Tire[]  tires =  {
	new HankooTire(),
	new HankooTire(),
	new HankooTire(),
	new HankooTire()
	};
	
	void run() {
		for (Tire tire : tires) {
			tire.roll();
		}
	}
}
