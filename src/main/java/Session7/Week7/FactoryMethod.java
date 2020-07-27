package Session7.Week7;

public class FactoryMethod
{
	public HouseType chooseHouse(int option) 
	{ 
	        if (option==1) 
	        { 
	            return new DuplexHouse(); 
	        } 
	        else if (option==2) 
	        { 
	            return new IndividualHouse(); 
	        } 
	        else if (option==3) 
	        { 
	            return new ApartmentHouse(); 
	        } 
	        else if (option==4)
	        {
	        	return new GroupHouse();
	        } 
	        else
	        {
	        	return null;
	        }
	}
}
