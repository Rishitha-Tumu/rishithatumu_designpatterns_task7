package Session7.Week7;

public class AdapterDesignPattern 
{
	//Yesu Prabhu and Mary Matha and Joseph
		public static void main(String args[])
		{
			Eagle e=new Eagle();
			Animals a=new Animal();
			Animals birdadapter=new BirdAdapter(e);
			System.out.print("Eagle "); 
	        e.fly(); 
	        e.sound(); 
	        System.out.print("Wild animals are "); 
	        a.wild(); 
	        System.out.print("Domestic animals are ");
	        a.domestic();
	        System.out.println("Calling the BirdAdapter class..."); 
	        System.out.print("Birds fly high ");
	        birdadapter.wild(); 
	        System.out.print("Some birds cannot fly high ");
	        birdadapter.domestic();
		}
}
