package Session7.Week7;

public class SingletonObject 
{
	//Yesu Prabhu and Mary Matha and Joseph
		private static SingletonObject instance=new SingletonObject();
		private SingletonObject() {}
		public static SingletonObject getInstance()
		{
			return instance;
		}
		public void showDisplay()
		{
			System.out.println("This is the singleton object class");
			   
		}
}
