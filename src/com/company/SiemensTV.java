package com.company;

public class SiemensTV extends Tv implements TvProducer {
@Override
public void producerNamed() {
	System.out.println("Siemens producer name - Germany");
	
}
}
