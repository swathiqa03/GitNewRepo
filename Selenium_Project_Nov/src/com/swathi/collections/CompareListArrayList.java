package com.swathi.collections;

import java.util.ArrayList;
import java.util.List;

public class CompareListArrayList {
	
	ArrayList<String> Arrl1= new ArrayList<String>();	
	ArrayList<String> Arrl2= new ArrayList<String>();	
	List<String> list1= new ArrayList<String>();
	
	
	public void compareTwoArrayLists()
	{
		
		try {
			Arrl1.add("Rambabu");
			Arrl1.add("Swathi");
			Arrl1.add("Gnapika");
			System.out.println(Arrl1);
			Arrl2.add("Swathi");
			Arrl2.add("Gnapika");
			System.out.println(Arrl2);
			System.out.println(Arrl1.containsAll(Arrl2));
		} 
		catch(Exception e)
		{
			System.out.print("Error occured");
		}
				
		finally
		{
			Arrl1.clear();
			Arrl2.clear();
		}
		
	}
	
	

	private void compareListToArrayList() 
	{
		try {
			Arrl1.add("Apple");
			Arrl1.add("Banana");
			Arrl1.add("Chicoo");
			System.out.println(Arrl1);
			System.out.println(Arrl2);
			System.out.println("List data:" + list1);
			System.out.println(Arrl1.containsAll(list1)); //true even when List data is empty
			System.out.println(Arrl1.contains("Banana"));
			list1.add("Chicoo");
			list1.add("Banana");
			System.out.println("List data:" + list1);
			System.out.println(list1.containsAll(Arrl1));
			System.out.println(Arrl1.containsAll(list1));
		} finally {
			Arrl1.clear();
			Arrl2.clear();
			list1.clear();
		}
	}
	
	public static void main(String[] args) 
	{
		CompareListArrayList comLists = new CompareListArrayList();
		comLists.compareTwoArrayLists();
		comLists.compareListToArrayList();
	}




}
