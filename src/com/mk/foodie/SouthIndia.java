package com.mk.foodie;

public class SouthIndia implements Region {

	SweetDish sw;
	
	public SouthIndia(SweetDish sw)
	{
		this.sw=sw;
	}
	@Override
	public String getFamousDish() {
		// TODO Auto-generated method stub
		return "Idli-Sambar";
	}

	public String getSweetDish()
	{
		return sw.getSweetDish();
	}
}
