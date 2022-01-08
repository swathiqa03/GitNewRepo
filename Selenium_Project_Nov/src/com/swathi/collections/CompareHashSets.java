//Compare 2 hashsets and returns elements which are same on both sides
package com.swathi.collections;

import java.util.HashSet;

public class CompareHashSets
{

	public static void main(String[] args)
	{
		HashSet<String> HS1= new HashSet<String>();
		
		HS1.add("Apple");
		HS1.add("Banana");
		HS1.add("Chicoo");
		HS1.add("Banana");
		HS1.add("Dragon Fruit");
		System.out.println("Hash set values" + HS1);
		
		HashSet<String> HS2= new HashSet<String>();
		
		HS2.add("Apple");
		HS2.add("Banana");
		HS2.add("Chicoo");
		

		System.out.println("Hash set valuesof HS2" + HS2);
		
		System.out.println(HS1.containsAll(HS2));
		HS1.retainAll(HS2);
		System.out.println("Hash set values after" + HS1);
		
		
	}

}
