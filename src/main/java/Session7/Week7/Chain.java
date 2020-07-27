package Session7.Week7;

public class Chain 
{
	Processor chain;  
	public Chain()
	{ 
	    buildChain(); 
	}   
	private void buildChain()
	{ 
	    chain = new Negativenumbers(new Zeronumbers(new Positivenumbers(null))); 
	} 
	  
	public void process(Number number) 
	{ 
	    chain.process(number); 
	} 
}
