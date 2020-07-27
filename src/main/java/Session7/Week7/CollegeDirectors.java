package Session7.Week7;

import java.util.ArrayList;
import java.util.List;

public class CollegeDirectors implements Staff
{
	private List<Staff> staffList = new ArrayList<Staff>(); 
	public void showStaffDetails() 
	{ 
		for(Staff s:staffList) 
		{ 
			s.showStaffDetails(); 
		} 
	} 
	public void addStaff(Staff s) 
	{ 
		staffList.add(s); 
	} 
	
	public void removeStaff(Staff s) 
	{ 
		staffList.remove(s); 
	} 
}
