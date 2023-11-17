package org.lessons.java.javaciclabile;

public class Numbers {
	
	private int[] numbers;
    private int currentIndex;
	
	public Numbers(int[] numbers) {
		setNumbers(numbers);
	}
	public Numbers() {
		this.numbers = new int[0];
	}

	public int[] getNumbers() {
		return numbers;
	}
	public void setNumbers(int[] numbers) {
		this.numbers = numbers;
	}
	public void setIndex() {
		this.currentIndex = 0;
	}
	
	public void addElemento(int number) {
		int[] nuovoArray = new int[numbers.length + 1];
		for (int i = 0; i < numbers.length; i++) {
            nuovoArray[i] = numbers[i];
        }
		nuovoArray[numbers.length] = number;
		numbers = nuovoArray;
	}
	public int getElementoSuccessivo() {
	   int nextI = numbers[currentIndex];
	   currentIndex = currentIndex + 1;
        return nextI;
	}
	public boolean hasAncoraElementi() {
		if(currentIndex < numbers.length) {
			return true;
		}
		return false;
	}
}
