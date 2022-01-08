package com.swathi.collections;

import java.util.ArrayList;

public class ArrayListBasicDemo 
{

	public static void main(String[] args)
	{
		
		ArrayList<Object> ArrList1=new ArrayList<Object>();
		ArrList1.add("Swathi");
		ArrList1.add("RamaBabu");
		ArrList1.add("Gnapika");
		ArrList1.add(2021);
		ArrList1.add(99);
			
		System.out.println(ArrList1);
		
		ArrList1.add(2021);
		System.out.println(ArrList1);
		
		System.out.println(ArrList1.contains("Swathi"));
		System.out.println(ArrList1.contains("sarabu"));
		
		System.out.println(ArrList1.indexOf(2021));
		System.out.println(ArrList1.lastIndexOf(2021));
		
		System.out.println(ArrList1.get(2));
		System.out.println(ArrList1.subList(1, 4));
		
		ArrList1.remove(5);
		System.out.println(ArrList1);
		
		ArrList1.remove("99");
		System.out.println(ArrList1);
		
		System.out.println(ArrList1.size());
		System.out.println(ArrList1.isEmpty());
		System.out.println(ArrList1.hashCode());
		
		ArrList1.add(2, "2019");
		//System.out.println(ArrList1.remove(99));
		System.out.println(ArrList1);
		
		ArrList1.set(1, "Ramudu");
		System.out.println(ArrList1);
		
		
	}

}
