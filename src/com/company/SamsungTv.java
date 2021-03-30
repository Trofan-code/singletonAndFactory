package com.company;

public class SamsungTv extends Tv implements TvProducer {

@Override
public void producerNamed() {
	System.out.println("Siemens producer name - Korea");
}
}
