package Number;
import java.util.Scanner;
public class Coupon
{
public static void main(String[] args)
{
  Scanner sc= new Scanner(System.in);
  System.out.println("Enter how many different coupon you want");
  int n=sc.nextInt();
  int a[]= new int[n];
  int c=0;
  for(int i=0;i<n;i++)
  {
	  double d= Math.random();
	  c=(int)(100*d);
	  int j;
	  for( j=0;j<=i;j++)
	  {
		  if(i==0)
			  a[i]=c;
		  else
		  {
			  if(a[j]!=c)
				  continue;
			  else
				  break;
		  }
		  }
	  if(j>i&&i!=0)
		  a[i]=c;
	  else if(a[j]==c && j<=i)
	  i--;
	  else
		  continue;
        
  }
  for(int k=0;k<a.length;k++)
  {
	  System.out.print(a[k]+" ");
  }
	}

}
