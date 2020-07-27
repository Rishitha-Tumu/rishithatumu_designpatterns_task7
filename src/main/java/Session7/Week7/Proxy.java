package Session7.Week7;

public class Proxy 
{
	//Yesu Prabhu and Mary Matha and Joseph
		public static void main(String args[])
		{
			Notification notify=new ProxyNotification();
			try
			{
				notify.sendto("WhatsApp");
				notify.sendto("Messenger");
				notify.sendto("Telegram");
				notify.sendto("E-mail");
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
}
