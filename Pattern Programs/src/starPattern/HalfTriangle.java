package starPattern;

public class HalfTriangle {
	
  public static void main(String[] args) {
	
	System.out.println("Right Triangle");
	
	for(int line=1; line<=5; line++)
	{
	  for (int star=1; star<=line; star++)
		System.out.print("*");
	  
	  System.out.println();
	}
	
	  System.out.println();
	  
//--------------------------------------------------------------//
	  
	System.out.println("Reverse Right Triangle");
	
	for(int line=5; line>=1; line--)
	{
	  for (int star=1; star<=line; star++)
		System.out.print("*");
	  
	  System.out.println();
	}
	
	System.out.println();
	
//-------------------------------------------------------//
	
	System.out.println("Left Triangle");
	  
    for (int line=1; line<=5; line++)
    {
        for (int space=line; space<5; space++)
    	System.out.print(" ");
      
        for (int star=1; star<=line; star++)
    	System.out.print("*");
      
      System.out.println();
    }
    
    System.out.println();
    
//--------------------------------------------------------//
      
    System.out.println("Reverse Left Triangle");
    
    for (int line=5; line>=1; line--)
    {
    	for (int space=(5-line); space>=1; space--)
    	  System.out.print(" ");
    	
    	for (int star=1; star<=line; star++)
    	  System.out.print("*");
    	
      System.out.println();
    }
  }
}
