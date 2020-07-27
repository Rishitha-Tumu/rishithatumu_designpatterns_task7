package Session7.Week7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CompositDesignPattern 
{
	//Yesu Prabhu and Mary Matha and Joseph
		public static void main(String args[]) throws IOException
		{
			Scanner sc=new Scanner(System.in);
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			CollegeDirectors directory = new CollegeDirectors(); 
			boolean choice=true;
			while(choice)
			{
					System.out.print("Enter the teaching staff Id:");
					int staffId=sc.nextInt();
					System.out.print("Enter the teaching staff name:");
					String staffName=reader.readLine();
					System.out.print("Enter the teaching staff position:");
					String staffPosition=reader.readLine();
					TeachingStaff ts1 = new TeachingStaff(staffId,staffName,staffPosition); 
				    CollegeDirectors tdirector = new CollegeDirectors(); 
					tdirector.addStaff(ts1); 
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
					directory.addStaff(tdirector); 
			}
			choice=true;
			while(choice)
			{		
				System.out.print("Enter the non teaching staff Id:");
				int staffId=sc.nextInt();
				System.out.print("Enter the non teaching staff name:");
				String staffName=reader.readLine();
				System.out.print("Enter the non teaching staff position:");
				String staffPosition=reader.readLine();
				NonTeachingStaff nts1 = new NonTeachingStaff(staffId,staffName,staffPosition);  
			    CollegeDirectors ntdirector = new CollegeDirectors(); 
				ntdirector.addStaff(nts1); 
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
				directory.addStaff(ntdirector); 
			}
			directory.showStaffDetails();
		}
}
