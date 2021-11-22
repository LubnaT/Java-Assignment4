package com.p1;

 class Inheritance {

	public float salary = 4000;
}

 class Bonus extends Inheritance{
	 int bon = 2000;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		 Bonus b = new Bonus();
		 System.out.println("The Salary is : "+b.salary);
		 System.out.println("The Salary is : "+b.bon);
		

	}

}
