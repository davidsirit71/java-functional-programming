package com.functionalprogramming;

import java.util.List;

public class FPNumberRunner {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(4,6,8,13,3,15);
		
	
		
		int sum = normalSum(numbers);
		System.out.println("normal: " + sum);
		
		sum = FPSum(numbers);
		System.out.println("FP: " + sum);
		
		sum = FPSumOdds(numbers);
		System.out.println("FP odd-impar: " + sum);
		
	}

	private static int normalSum(List<Integer> numbers) {
		int sum=0;
		for(int number: numbers) {
			sum += number;		// esto se llama mutation.. 
		}						//el valor va cambiando
		return sum;
	}
	
	private static int FPSum(List<Integer> numbers) {

		return numbers.stream()
			.reduce(0, (num1, num2)-> num1 + num2);
	}
	
	private static int FPSumOdds(List<Integer> numbers) {
		int sum=0;

		sum = numbers.stream()
			.filter(elem -> elem%2==1)
			.reduce(0, (num1, num2)-> num1 + num2);
		
		return sum;
	}

}
