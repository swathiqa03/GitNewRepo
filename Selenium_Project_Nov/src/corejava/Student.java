package corejava;

public class Student {
	
	static String cname="Durga soft";
	int sno;
	String sname;
	
	Student(int sno,String sname){
		this.sno=sno;
		this.sname=sname;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1=new Student(101,"Sunny");
		Student s2=new Student(102,"Bunny");
		Student s3=new Student(103,"Chinny");
		
		System.out.println(s1.sno);
		System.out.println(s1.sname);
		System.out.println(s1.cname);
		
		System.out.println(s2.sno);
		System.out.println(s2.sname);
		System.out.println(s2.cname);
		
		System.out.println(s3.sno);
		System.out.println(s3.sname);
		System.out.println(s3.cname);
	}

}
