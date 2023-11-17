package org.lessons.java.javaciclabile;

public class Numbers {
	
	private int[] numbers;
    private int currentIndex;
	
	public Numbers(int[] numbers) {
		setNumbers(numbers);
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
