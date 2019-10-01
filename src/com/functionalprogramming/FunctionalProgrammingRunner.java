package com.functionalprogramming;

import java.util.List;

public class FunctionalProgrammingRunner {

	public static void main(String[] args) {
		List<String> list = List.of("Manzana", "Banana", "Gato", "Perro");
		printBasic(list);
		printBasicWithFiltering(list);
		printWithFP(list);
		printWithFPWithFiltering(list);
		
		List<Integer> numeros = List.of(1,4,7,9,10);
		
		imprimeImparesFP(numeros);
		imprimeParesFP(numeros);
		
	}

	private static void printBasic(List<String> list) {
		System.out.println("POO " );
		for(String item: list) {
			System.out.println(item);
		}
		System.out.println("");
	}
	
	private static void printBasicWithFiltering(List<String> list) {
		System.out.println("POO filter " );
		for(String item: list) {
			if(item.endsWith("ana")) {
				System.out.println(item);
			}
		}
		System.out.println("");
	}
	
	private static void printWithFP(List<String> list) {
		System.out.println("FP " );
		// esto es lambda expresion
		list.stream().forEach(
				elem -> System.out.println("element -" + elem)
				);
		System.out.println("");
	}
	
	private static void printWithFPWithFiltering(List<String> list) {
		System.out.println("FP filter" );
		// esto es lambda expresion
		list.stream()
			.filter(elem -> elem.endsWith("ana"))
			.forEach(elem -> System.out.println("element -" + elem)
				);
		System.out.println("");
	}
	
	private static void imprimeImparesFP(List<Integer> list) {
		System.out.println("fintro impares" );
		list.stream()
			.filter(num -> num%2==1)
			.forEach(num -> System.out.println(num)
					);
	}
	
	private static void imprimeParesFP(List<Integer> list) {
		System.out.println("fintro pares" );
		list.stream()
			.filter(num -> num%2==0)
			.forEach(num -> System.out.println(num)
					);
	}

}
