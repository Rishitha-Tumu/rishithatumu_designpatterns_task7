package Session7.Week7;

public class Negativenumbers extends Processor
{
	//Yesu Prabhu and Mary Matha and Joseph
	public Negativenumbers(Processor processor)
	{ 
        super(processor); 
          
    } 
    public void process(Number request)  
    {  
        if (request.getNumber() < 0)  
        {  
            System.out.println(request.getNumber()+" is the negative number");  
        }  
        else
        {  
            super.process(request);  
        }  
    }  
}