package com.functionalprogramming;

import java.util.HashMap;
import java.util.Map;

public class PruebaHashQuestion {

	public static void main(String[] args) {
		Empleado emp1 = new Empleado(1);
		Empleado emp2 = new Empleado(1);
		
		Map<Empleado, String> map = new HashMap<Empleado, String>();
		map.put(emp1, "Pedro");
		map.put(emp2, "Pedro");

		System.out.println(map.size()); // la respuesta es 2 pero debe ser 1
		System.out.println(map.entrySet()); // si hay meto hashCode no duplica

		
		
		//esta es la clave .. esta clase tiene el metodo hashCode implementado
		Integer i1 = new Integer(1);
		Integer i2 = new Integer(1);
		
		Map<Integer, String> map2 = new HashMap<Integer, String>();
		map2.put(i1, "one");
		map2.put(i2, "one");
		System.out.println(map2.size()); // debe ser 1
		
	}

}

class Empleado {
	int id;
	
	public Empleado (int id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empleado other = (Empleado) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	// luego se implement esto para evitar duplicados
	
	
}
