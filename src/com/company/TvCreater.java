package com.company;

public class TvCreater {
	private final TvFactorySecondImplementationSingleton tvFactory;

public TvCreater(TvFactorySecondImplementationSingleton tvFactory) {
	this.tvFactory = tvFactory;
}
public Tv createTv (TypeOfTv typeOfTv){
	Tv myTv = tvFactory.createTv(typeOfTv);
	myTv.createTv();
	return myTv;
}
}
