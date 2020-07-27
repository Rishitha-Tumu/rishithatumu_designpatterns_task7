package Session7.Week7;

public class NonTeachingStaff implements Staff
{
	private String staffname; 
	private int staffId; 
	private String position; 
	public NonTeachingStaff(int staffId, String staffname, String position) 
	{ 
		this.staffId = staffId; 
		this.staffname = staffname; 
		this.position = position; 
	} 
	public void showStaffDetails() 
	{ 
		System.out.println(staffId+" " +staffname+" "+position); 
	} 
}
