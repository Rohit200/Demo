package Program;
import java.util.Scanner;
public class Gambler
{
   static double win=0;
   static double loss=0;
   static int stack;
   static int trails;
   static int goals;
   static void play(int n)
   {
	   int i=1;
	   while(i<=n && stack>0 && stack <=goals)
	   {
		  double d=Math.random();
		  if(d<0.5)
		  {
			  loss++;
		  stack--;
		  }
		  else
		  {
			  win++;
			  stack--;
		  }
		  i++;
	   }
	   System.out.println("the winning chance is "+ win/trails);
System.out.println("the lossing chance is "+ loss/trails);
	   }
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("how many trails");
	trails =sc.nextInt();
	System.out.println("how many stack");
	stack = sc.nextInt();
	System.out.println("what is your goal");
     goals = sc.nextInt();
     play(trails);
	}

}
