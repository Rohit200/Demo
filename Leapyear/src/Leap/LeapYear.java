package Leap;
import java.util.Scanner;
public class LeapYear
{
	static int count(int n)
	{
		int c=0;
		while(n>0)
		{
			c++;
			n=n/10;
		}
		return c;
	}
	static boolean leap(int n)
	{
		if(n%100==0 && n%400==0)
			return true;
		else if(n%4==0 && n%100!=0)
			return true;
		else 
			return false;
	}
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the year");
     int n=sc.nextInt();
     int c=count(n);
     if(c==4)
     {
    	 boolean rs=leap(n);
    	 if(rs)
    		 System.out.println("leap year "+n);
    	 else
    		 System.out.println("Not a leap year "+n);
     }
     else
    	 System.out.println("Enter four digit year");
	}

}
