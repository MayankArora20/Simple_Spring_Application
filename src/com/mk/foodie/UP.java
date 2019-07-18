package com.mk.foodie;

public class UP implements Region {

	SweetDish sw;

	
	public void setSweetDish(SweetDish s)
	{
		sw=s;
	}
	
	@Override
	public String getFamousDish() {
		// TODO Auto-generated method stub
		return "puri-sabji";
	}

	@Override
	public String getSweetDish() {
		// TODO Auto-generated method stub
		return sw.getSweetDish();
	}

}
