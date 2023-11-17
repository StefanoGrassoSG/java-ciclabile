package org.lessons.java.javaciclabile;

public class Main {
	public static void main(String[] args) {
		
		int[] numbers = {10, 20, 30, 40, 50};
		
		Numbers n = new Numbers(numbers);
		n.addElement(60);
		
		Numbers f = new Numbers();
		f.addElement(1);
		f.addElement(2);
		f.addElement(3);
		f.addElement(4);
		f.addElement(5);
		
	   for (int i = 0; n.hasAncoraElementi(); i++) {
            System.out.println(n.getNextElement());
            System.out.println(n.hasAncoraElementi());
        }
	   
	   System.out.println("------------------------------");
	   
	   for (int i = 0; f.hasAncoraElementi(); i++) {
           System.out.println(f.getNextElement());
           System.out.println(f.hasAncoraElementi());
       }

	}
}
