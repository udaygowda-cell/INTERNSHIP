//package com.jspider.HasA;


class Demo{
	void test()
	{
		System.out.println("Exicuting....");
	}
}
class sample{
	Demo ref = new Demo();
}
public class Mainclass1 {

	public static void main(String[] args) {
		sample s = new sample();
		s.ref.test();
		// TODO Auto-generated method stub

	}

}
