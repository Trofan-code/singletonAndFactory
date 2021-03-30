package com.company;

public class TvFactorySecondImplementationSingleton {
public Tv createTv (TypeOfTv type) {
	Tv myTv = null;
	
	switch (type) {
		case SIEMENS:
			myTv = new SiemensTV();
			break;
		case SAMSUNG:
			myTv = new SamsungTv();
			break;
	}
	
	return myTv;
}
}
