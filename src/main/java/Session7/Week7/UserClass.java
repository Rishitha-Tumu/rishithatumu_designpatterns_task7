package Session7.Week7;

import java.util.Scanner;

public class UserClass 
{
	//Yesu Prabhu and Mary Matha and Joseph
		public static void main(String[] args) 
		{ 
		    FactoryMethod factory = new FactoryMethod();
		    Scanner s=new Scanner(System.in);
		    while(true)
		    {
			    System.out.println("Menu");
			    System.out.println("1.Duplex House");
			    System.out.println("2.IndividualHouse");
			    System.out.println("3.Apartment House");
			    System.out.println("4.Group House");
			    System.out.println("5.Exit");
			    System.out.print("Please enter your choice:");
			    int choice=s.nextInt();
			    if(choice==5)
			    {
			    	System.out.println("----EXIT----");
			    	System.exit(0);
			    }
			    HouseType house=((HouseType) factory).chooseHouse(choice);
			    house.UserCentric();
		    }
		}
}
