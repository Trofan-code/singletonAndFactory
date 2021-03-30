package com.company;

public class TVFactoryFirstImplementationSingleton {

public TvProducer create(int typeOfTv) {
	
	if (typeOfTv == 1) {
		return new SamsungTv();
	
	} else if (typeOfTv == 2) {
		return new SiemensTV();
	
	} else {
		throw new RuntimeException(" There is no one type like" + typeOfTv);
	}
	
	
}
}
