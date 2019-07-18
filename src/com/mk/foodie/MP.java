package com.mk.foodie;

public class MP implements Region {

SweetDish sw;
	
	public MP(SweetDish sw)
	{
		this.sw=sw;
	}
	
	@Override
	public String getFamousDish() {
		// TODO Auto-generated method stub
		return "Poha Sev";
	}

	@Override
	public String getSweetDish() {
		// TODO Auto-generated method stub
		return "jalabi";
	}

}
