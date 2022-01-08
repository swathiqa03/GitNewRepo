package corejava;

public class StringExample {

	public static void main(String[] args)
	
	{
		String s1="swathi";
		String s2= new String("Sarabu");
		System.out.println(s1);
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);
		System.out.println(s1+" "+ s2);
		System.out.println(s1.concat(s2));
		
	    String 	s3= "Swathi";
	    System.out.println(s1.equals(s3));
	    System.out.println(s1.equalsIgnoreCase(s3));
	    System.out.println(s1.equals(s3.toLowerCase()));
	    
	    
	    String s4="Swath";
	    System.out.println(s1.equals(s4));
	    System.out.println(s1.contains(s4));
	    System.out.println(s1.contains(s4.toLowerCase()));
	    
	    System.out.println(s1.hashCode());
	    System.out.println(s1.isEmpty());
	    
	   String s5="Swathi Sarabu Rambabu" ;
	   String[] s6= s5.split(" ");
	   
	   for(String str:s6)
	   {
		   System.out.println(str);
	   }
		   
       String[] s7= s5.split("a");
	   
	   for(String str:s7)
	   {
		   System.out.println(str);
	   }   
	    
	    
	    
	    
	

	}

}
