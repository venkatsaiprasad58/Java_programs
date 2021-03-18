package com.sample;

class Data
{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}


public class EncpasulationDemo {
	public static void main(String[] args) {
		 
		Data d = new Data();
		
		d.setName("prasad");
		System.out.println(d.getName());
	}

}
