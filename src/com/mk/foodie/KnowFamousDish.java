package com.mk.foodie;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class KnowFamousDish {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create context
		ClassPathXmlApplicationContext con=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrive bean
		Region r=con.getBean("IndianRegion2",Region.class);
		
		System.out.println(r.getFamousDish());
		
		System.out.println(r.getSweetDish());
		
		con.close();
	}

}
