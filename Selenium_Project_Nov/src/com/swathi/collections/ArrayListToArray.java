package com.swathi.collections;

import java.util.ArrayList;

public class ArrayListToArray {

	public static void main(String[] args) 
	{
		ArrayList<Integer> Arrl= new ArrayList<Integer>();
		Arrl.add(10);
		Arrl.add(20);
		Arrl.add(30);
		Arrl.add(40);		
		Arrl.add(50);
		Arrl.add(60);	
		
		System.out.println("Values in ArrayList" + Arrl);
	
		int[] arr=new int[Arrl.size()];
		System.out.println(arr.length);
		
		System.out.println("Values in Array by using for loop");
		for(int i=0;i<Arrl.size();i++)
		{
			if(Arrl.get(i)!=0)
			{
			arr[i]=Arrl.get(i);
			}
			System.out.println(arr[i]);
		}
		
		
		
		
		

	}

}
