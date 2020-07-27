package Session7.Week7;

import java.util.ArrayList;
import java.util.List;

public class ProxyNotification implements Notification
{
	private Notification notify = new SendNotification(); 
	private static List<String> bannedMedia; 
	static
	{ 
	        bannedMedia = new ArrayList<String>(); 
	        bannedMedia.add("Twitter"); 
	        bannedMedia.add("LinkedIn"); 
	        bannedMedia.add("Facebook"); 
	        bannedMedia.add("Instagram"); 
	 }   
	 public void sendto(String str) throws Exception 
	 { 
	    if(bannedMedia.contains(str.toLowerCase())) 
	    { 
	        throw new Exception("Access Denied"); 
	    } 
	    notify.sendto(str); 
	 }  
}
