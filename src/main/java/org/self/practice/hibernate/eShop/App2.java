package org.self.practice.hibernate.eShop;

public class App2 {

	public int methodA(int tries) {
		System.out.println(tries);
		if (tries > 0) {
			methodA(tries = tries - 1);
		} 
		return -1;
	}

	public static void main(String[] args) {
		App2 app2 = new App2();
		System.out.println(app2.methodA(5));
	}

}
