package org.lessons.java.javaciclabile;

public class Main {
	public static void main(String[] args) {
		
		int[] numbers = {10, 20, 30, 40, 50};
		
		Numbers n = new Numbers(numbers);
		
		for(int x=0;x<numbers.length;x++) {
			System.out.println(n.getElementoSuccessivo());
			System.out.println(n.hasAncoraElementi());
		}
	}
}
