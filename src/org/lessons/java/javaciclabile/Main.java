package org.lessons.java.javaciclabile;

public class Main {
	public static void main(String[] args) {
		
		int[] numbers = {10, 20, 30, 40, 50};
		
		Numbers n = new Numbers(numbers);
		n.addElemento(60);
		
		Numbers f = new Numbers();
		f.addElemento(1);
		f.addElemento(2);
		f.addElemento(3);
		f.addElemento(4);
		f.addElemento(5);
		
	   for (int i = 0; n.hasAncoraElementi(); i++) {
            System.out.println(n.getElementoSuccessivo());
            System.out.println(n.hasAncoraElementi());
        }
	   
	   System.out.println("------------------------------");
	   
	   for (int i = 0; f.hasAncoraElementi(); i++) {
           System.out.println(f.getElementoSuccessivo());
           System.out.println(f.hasAncoraElementi());
       }

	}
}
