package starPattern;

public class TriangleIn4Quadrant {

  public static void main(String[] args){
	  
    System.out.println("Triangle in 4 Quadrant");
	    
	for (int line=1; line<=10; line++)
	{
	  for (int space=line; space<10; space++)
	    System.out.print(" ");
	      
	  for (int star=1; star<=line; star++)
	    System.out.print("*");
	        
	  for (int space1=1; space1<=3; space1++)
	    System.out.print(" ");
	        
	  for (int star=1; star<=line; star++)
	    System.out.print("*");
	    	  
	  System.out.println();
	 }
	    
	    System.out.println();
	    
	 for (int line=10; line>=1; line--)
	 {
	   for (int space=(10-line); space>=1; space--)
	     System.out.print(" ");
	    	
	   for (int star=1; star<=line; star++)
	     System.out.print("*");
	    	
	   for (int space1=1; space1<=3; space1++)
	     System.out.print(" ");
	    	
	   for (int star=1; star<=line; star++)
	     System.out.print("*");
	    	
	   System.out.println();
	  }
  }
}
