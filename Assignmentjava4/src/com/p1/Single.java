package com.p1;

public class Single {
	
	 public int i =200;
	

}

class Double extends Single{
	public static void main(String[] args) {
		int j=120;
		Double d = new Double();
		System.out.println(+j+"Te output: "+d.i);
	}
	
}
