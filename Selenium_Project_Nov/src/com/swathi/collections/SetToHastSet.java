//Copy from Set to HashSet
package com.swathi.collections;

import java.util.HashSet;

public class SetToHastSet 
{

	@SuppressWarnings("unchecked")
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
		HS2=(HashSet<String>) HS1.clone();
		
		System.out.println("Hash set values after copying" + HS2);
	}

}
