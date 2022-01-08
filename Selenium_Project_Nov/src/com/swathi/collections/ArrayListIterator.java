//1. Reading all elements by using Array List Iterator
//2. Copying from one arraylist to another by using clone()

package com.swathi.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIterator 
{
	@SuppressWarnings("unchecked")
	public static void main(String[] args)
	{
		ArrayList<Integer> Arrl=new ArrayList<Integer>();
		Arrl.add(10);
		Arrl.add(20);
		Arrl.add(30);
		Arrl.add(40);
		Arrl.add(50);
		
		System.out.println(Arrl);
		
		Iterator<Integer> Itr= Arrl.iterator();
		
		while(Itr.hasNext())
		{
			System.out.println(Itr.next());
		}
			
		ArrayList<Integer> ArrL2= new ArrayList<Integer>();
		
		ArrL2=(ArrayList<Integer>) Arrl.clone();
		
		System.out.println("Cloned Arraylist" + ArrL2);
		
			
	}
}
