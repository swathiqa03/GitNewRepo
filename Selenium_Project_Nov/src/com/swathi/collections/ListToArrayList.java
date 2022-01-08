//1.Adding elements from Arraylist to List
//2. Adding elements from List to arraylist
//3. removing all elements from arraylist

package com.swathi.collections;

import java.util.ArrayList;
import java.util.List;

public class ListToArrayList {

	public static void main(String[] args)
	{
		
		ArrayList<String> Arrl= new ArrayList<String>();
		Arrl.add("Rambabu");
		Arrl.add("Swathi");
		Arrl.add("Gnapika");
		
		System.out.println(Arrl);
	
		List<String> list =new ArrayList<String>();
		list.add("Tatikonda");
		list.add("Sarabu");
		
		System.out.println(list);
		//list.addAll(Arrl);
		//System.out.println("After adding"+ list);
		Arrl.addAll(list);
		
		System.out.println("After adding"+ Arrl);
		
		Arrl.clear();
		System.out.println("After removing all elements from Arraylist" + Arrl);
		


	}

}
