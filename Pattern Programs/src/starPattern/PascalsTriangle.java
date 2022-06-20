package starPattern;

public class PascalsTriangle {
	
  //Using Instance Method

  public static void rightPascalsTriangle() {
	
	System.out.println("Right Pascal's Triangle");
	System.out.println();
	
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
  }
	
//---------------------------------------------------------------------//
	
  public static void leftPascalsTriangle() { 
  
    System.out.println("Left Pascal's Triangle");
    System.out.println();
	
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
	
	  System.out.println();
  }
  
  
  public static void main(String[] args) {
	  
	  rightPascalsTriangle();
	  leftPascalsTriangle();
  }
}
