package patternPrograms;

public class Pattern2 {
	
	public static void rightTriangle(int n)
	{
		for(int i=1;i<=n;i++)
		{
			{
			System.out.print(" ");
			}
			
			for(int j=1;j<=i;j++)
			{				
			System.out.print(j+" ");
			}
			System.out.println();	
		}	
	}
	
	public static void pyramid(int n)
	{
		int i,j;
		for(i=1;i<=n;i++)
		{
			for(j=0;j<n-i;j++)   	//for(j=n;j>i-1;j--)   
									//{
									//System.out.print(" ");
									//}
			{
				System.out.print(" ");
			}
					
			for(j=1;j<=i;j++)
			{				
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
	}
	
	public static void leftTriangle(int n)
	{
		int i,j;
		for(i=1;i<=n;i++)
		{
			for(j=2*n-1;j>0;j--)   
			{
				System.out.print(" ");
			}
					
			for(j=1;j<=i;j++)
			{				
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
	}

	public static void main(String[] args) 	
	{
		int n=5;
		rightTriangle(n);
		pyramid(n);
		leftTriangle(n);

	}

}
