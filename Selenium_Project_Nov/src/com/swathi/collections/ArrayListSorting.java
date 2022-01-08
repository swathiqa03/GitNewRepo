//Sorting arraylist using comparator
package com.swathi.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListSorting
{

	public static void main(String[] args) 
	{
		ArrayList<Empl> arrl=new ArrayList<Empl>();
		arrl.add(new Empl("Ram",1000));
		arrl.add(new Empl("Laxman",4000));
		arrl.add(new Empl("Sita",2000));
		arrl.add(new Empl("Bharat",500));
		arrl.add(new Empl("Hanuman",3500));
		
		System.out.println("Before sorting:");
		
		for(Empl e:arrl)
		{
			System.out.println(e);
		}
		
		Collections.sort(arrl, new MySalaryComponent());
        System.out.println("After sorting:");
		
		for(Empl e:arrl)
		{
			System.out.println(e);
		}

	}

}

class MySalaryComponent implements Comparator<Empl>
{

	@Override
	public int compare(Empl e1,Empl e2 ) 
	{
		if(e1.getSalary()<e2.getSalary())
			return 1;
		else
		    return -1;
	}
	
	
}


class Empl
{
	private String name;
	private int salary;
	
	public Empl(String name,int salary)
	{
		this.name=name;
		this.salary=salary;
	}
	
	public String getName()
	{
		return name;
	}
	public void setname(String name)
	{
		this.name=name;
	}

	public int getSalary()
	{
		return salary;
	}
	public void setSalary(int salary)
	{
		this.salary=salary;
	}
	
	public String toString()
	{
		return "Name: "+this.name+"-- Salary: "+this.salary;
	}
	
	
}
