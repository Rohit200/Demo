package pfactor;
import java.util.Scanner;
public class Factor
{
	static boolean prime(int n)
	{
		int i;
		for( i=2;i<=n/2;i++)
		{
			if(n%i!=0)
				continue;
			else
				break;
			}
		if(n==1||n==0)
			return false;
		else if(i>n/2||n==2)
			return true;
		else
			return false;
	}
public static void main(String[] args)
{
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the number");
 int n=sc.nextInt();
 for(int i=2;i*i<=n;i++)
 {
	 if(n%i==0)
	 {
		 boolean rs= prime(i);
		 if(rs)
		 System.out.println(i);
		 //n=n/i;
	 }
 }

	}

}
