package Power;
import java.util.Scanner;
public class Power2
{
  public static void main(String []args)
  {
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter the Number");
	  int n=sc.nextInt();
	  if(n<31)
	  {
		  int sum =1;
		  for(int i=1;i<=n;i++)
		  {
			  sum=sum*2;
			  System.out.println("2"+"^" +i+ "=" + sum);
			  }
		  }
	  else
		  System.out.println("Enter the number less than 31");
	  }
}
