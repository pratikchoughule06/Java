package starPattern;

public class PascalsTriangle {

  public static void main(String[] args) {
	
	System.out.println("Right Pascal's Triangle");
	
	for(int line=1; line<=7; line++)
	{
      for(int space=line; space<7; space++)
        System.out.print(" ");
      
      for(int star=1; star<=line; star++)
    	System.out.print("*");
      
      System.out.println();
	}
	
	for(int line=6; line>=1; line--)
	{
	  for (int space=(7-line); space>=1; space--)
	    System.out.print(" ");
	  
	  for(int star=1; star<=line; star++)
	    System.out.print("*");
	  
	  System.out.println();
	}
	
	System.out.println();
	
//---------------------------------------------------------------------//
	
	System.out.println("Left Pascal's Triangle");
	
	for (int line=1; line<=7; line++)
	{
	  for(int star=1; star<=line; star++)
	    System.out.print("*");
	  
	  System.out.println();
	}
	
	for (int line= 6; line>=1; line--)
	{
	  for (int star=1; star<=line; star++)
	    System.out.print("*");
	  
	  System.out.println();
	}
  }
}
