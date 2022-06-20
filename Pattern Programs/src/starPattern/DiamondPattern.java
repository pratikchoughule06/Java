package starPattern;

public class DiamondPattern {
	
  //Using Instance Method
	
  public static void diamondPattern() {
	  
    System.out.println("DIAMOND");
    System.out.println();
	    
	for (int line=1; line<=10; line ++)
	{
	  for (int space=(10-line); space>=1; space--)
	    System.out.print(" ");
	    	
	  for (int star=1; star<=line; star++)
	    System.out.print("* ");
	    	
	  System.out.println();
	}
	    
	for (int line=9; line>=1; line--)
	{
	  for (int space=(10-line); space>=1; space--)
	    System.out.print(" ");
	    	
	  for(int star=1; star<=line; star++)
	    System.out.print("* ");
	    	
	  System.out.println();
	}
	
	  System.out.println();
  }
  
  
  public static void main(String[] args) {
	  
	  diamondPattern();
  
  } 
}
