//How to iterate through Hashset 
package com.swathi.collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetIterator {

	public static void main(String[] args) 
	{
		HashSet<String> HS1= new HashSet<String>();
		
		HS1.add("Apple");
		HS1.add("Banana");
		HS1.add("Chicoo");
		HS1.add("Banana");
		HS1.add("Dragon Fruit");
		System.out.println("Hash set values" + HS1);
		
		System.out.println("Elements of Hashset");
		Iterator<String> itr= HS1.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		HashSet<Integer> HS2= new HashSet<Integer>();
		HS2.add(10);
		HS2.add(20);
		HS2.add(30);
		HS2.add(50);
		HS2.add(10);
		System.out.println("Hash set values" + HS2);
		
		Iterator<Integer> Itr1=HS2.iterator();
		while(Itr1.hasNext())
		{
			System.out.println(Itr1.next());
		}

	}

}
