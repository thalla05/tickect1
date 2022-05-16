import java.util.Scanner;
class lcm 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
	    System.out.println("enter n value");
		int n=sc.nextInt();
		System.out.println("enter m value");
		int m=sc.nextInt();
		int g=0;
		for(int i=1; i<n; i++)
		{
			if(n%i==0&&m%i==0)
			
				g=i;
		}
		
		int lcm=n*m/g;
		 System.out.println(lcm);
		
		


		
	}
}
