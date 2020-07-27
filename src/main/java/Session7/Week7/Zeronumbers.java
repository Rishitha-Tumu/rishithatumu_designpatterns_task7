package Session7.Week7;

public class Zeronumbers extends Processor
{
	//Yesu Prabhu and Mary Matha and Joseph
	public Zeronumbers(Processor processor)
	{ 
        super(processor); 
          
    } 
    public void process(Number request)  
    {  
        if (request.getNumber() == 0)  
        {  
            System.out.println(request.getNumber()+" is equal to zero");  
        }  
        else
        {  
            super.process(request);  
        }  
    }  
}