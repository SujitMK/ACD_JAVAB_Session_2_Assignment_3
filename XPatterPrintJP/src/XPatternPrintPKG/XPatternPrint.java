package XPatternPrintPKG;

public class XPatternPrint {

	public static void main(String[] args) {
		
    System.out.println();		
	System.out.println("The X Patter Is As Shown Below");
	System.out.println();
	System.out.println("******************************");
	System.out.println();
	
	for(int i=1; i<8; i++)                                // Loop to handle the Rows
	{
		for(int j=1; j<8; j++)                            // Loop to handle the Columns
		{
		    if (j == i || j == 8-i)                       // Conditional print 
		    {
		    	System.out.print("X");
		    }
		    else System.out.print(" ");
		}	
	    
		System.out.println();                             // New Line
	}
	
	System.out.println();
	System.out.println("******************************");
  
  }
}
