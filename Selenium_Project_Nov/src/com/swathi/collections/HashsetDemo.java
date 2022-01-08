package com.swathi.collections;

import java.util.HashSet;

public class HashsetDemo {

	public static void main(String[] args)
	{
		HashSet<String> HS1= new HashSet<String>();
		
		HS1.add("Apple");
		HS1.add("Banana");
		HS1.add("Chicoo");
		HS1.add("Banana");
		HS1.add("Dragon Fruit");
		System.out.println("Hash set values" + HS1);
		
		System.out.println(HS1.contains("Chicoo"));
		
		HashSet<String> HS2= new HashSet<String>();
		
		HS2.add("Apple");
		HS2.add("Banana");
		HS2.add("Chicoo");
		

		System.out.println("Hash set valuesof HS2" + HS2);
		
		System.out.println(HS1.containsAll(HS2));
		System.out.println(HS2.contains(HS1));
		
		HS2.add("Mango");
		System.out.println("Hash set valuesof HS2after adding Mango" + HS2);
		
		System.out.println("After equals" + HS1.equals(HS2));
		System.out.println(HS1.isEmpty());
		
		System.out.println(HS1.size());
		System.out.println(HS2.size());
		
		HS1.addAll(HS2);
		System.out.println("Hash set values after adding" + HS1);
		
		HS1.clear();
		System.out.println("Hash set values after clearing" + HS1);
		System.out.println(HS1.isEmpty());
		
		
		
		
		
		
	}

}
