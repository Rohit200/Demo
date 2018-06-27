package Flip;
import java.util.Scanner;
public class FlipCoin
{
public static void main(String[] args)
{
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the number of times you want to flip the coin");
  int n=sc.nextInt();
  int tail=0,head=0;
  
  if(n>0)
  {
	  for(int i=1;i<=n;i++)
	  {
		  double d=Math.random();
		  if(d>0.5)
			  head++;
		  else
			  tail++;
	  }
		  
  }
  if(n>0)
  {
	 System.out.println("Number of times tail comes "+tail);
	 System.out.println("Number of times head comes "+head); 
	}
  else
	  System.out.println("please flip a coin atleast one time"); 
}
}
