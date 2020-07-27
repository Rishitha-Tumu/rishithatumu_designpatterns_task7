package Session7.Week7;

public class Positivenumbers extends Processor
{
	//Yesu Prabhu and Mary Matha and Joseph
	public Positivenumbers(Processor processor)
	{ 
        super(processor); 
          
    } 
    public void process(Number request)  
    {  
        if (request.getNumber() > 0)  
        {  
            System.out.println(request.getNumber()+" is the positive number");  
        }  
        else
        {  
            super.process(request);  
        }  
    }  
}