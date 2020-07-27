package Session7.Week7;

import java.util.Scanner;

public class ChainofResponsibilityDesignPattern
{
	//Yesu Prabhu and Mary Matha and Joseph
		public static void main(String args[])
		{
			Scanner sc=new Scanner(System.in);
			Chain chain=new Chain();
			boolean choice=true;
			while(choice)
			{
				System.out.print("Please enter the number:");
				int n=sc.nextInt();
				chain.process(new Number(n));
				System.out.print("Do you want to continue(Y/y)?:");
				char ch=sc.next().charAt(0);
				if(ch=='Y'||ch=='y')
				{
					choice=true;
				}
				else
				{
					choice=false;
				}
			}
		}
}
