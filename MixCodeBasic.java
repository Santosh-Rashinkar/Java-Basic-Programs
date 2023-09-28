package com.practice.basic.java;

public class MixCodeBasic {
	
	private int roll;
	private String name;
	private String address1;
	

	public static int addition(int a, int b)
	{
		int c = a+b;
		
		System.out.println("addition is :" +c);
		
		return c;	
	}
	
	static{
		
		System.out.println("static block practice program-111!!!");
		
	}
	
	public MixCodeBasic(){
		
	}
	
	public MixCodeBasic(int roll,String name,String address1){
		
		this.roll = roll;
		this.name = name;
		this.address1 = address1;
		
		System.out.println(roll);
	    System.out.println(name);
	    System.out.println(address1);
	}
	public  float sub(float x, float y)
	{
		float res = x-y;
		
		System.out.println("subtraction is :" +res);
		
		return res;
	}
	public  MixCodeBasic(String address1)
	{
		this.address1 = address1;
		
		System.out.println(address1);
	}
	
	{
		System.out.println("instance block statement-111");
	}
	
	public static void main(String[] args)
	{
		addition(40,40);
		
		 MixCodeBasic t1 = new  MixCodeBasic(10,"ram","pune");
		
		t1.sub(80,50);
	}
}