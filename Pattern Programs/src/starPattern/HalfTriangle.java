package starPattern;

public class HalfTriangle {
	
  //Using Instance Method
	
  public static void rightTriangle() {
	
	System.out.println("Right Triangle");
	System.out.println();
	
	for(int line=1; line<=5; line++)
	{
	  for (int star=1; star<=line; star++)
		System.out.print("*");
	  
	  System.out.println();
	}
	
	  System.out.println();
  }
	  
//--------------------------------------------------------------//
	  
  public static void reverseRightTriangle() {
  
  System.out.println("Reverse Right Triangle");
  System.out.println();
	
	for(int line=5; line>=1; line--)
	{
	  for (int star=1; star<=line; star++)
		System.out.print("*");
	  
	  System.out.println();
	}
	
	System.out.println();
  }
	
//-------------------------------------------------------//
	
  public static void leftTriangle() {
  
    System.out.println("Left Triangle");
    System.out.println();
	  
    for (int line=1; line<=5; line++)
    {
        for (int space=line; space<5; space++)
    	System.out.print(" ");
      
        for (int star=1; star<=line; star++)
    	System.out.print("*");
      
      System.out.println();
    }
    
    System.out.println();
  }
    
//--------------------------------------------------------//
      
  public static void reverseLeftTriangle() {
  
    System.out.println("Reverse Left Triangle");
    System.out.println();
    
    for (int line=5; line>=1; line--)
    {
    	for (int space=(5-line); space>=1; space--)
    	  System.out.print(" ");
    	
    	for (int star=1; star<=line; star++)
    	  System.out.print("*");
    	
      System.out.println();
    }
    
      System.out.println();
  }
  
  
  public static void main(String[] args) {
	  
	  rightTriangle();
	  reverseRightTriangle();
	  leftTriangle();
	  reverseLeftTriangle();
  }
}
