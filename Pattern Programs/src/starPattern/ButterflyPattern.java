package starPattern;

public class ButterflyPattern {
	
  //Using Instance Method

  public static void butterflyPattern() {
	  
	System.out.println("BUTTERFLY PATTERN");
	System.out.println();
	
    for (int line=1; line<=10; line++)
    {
      for (int star=1; star<=line; star++)
        System.out.print("*");
      
      for (int space=9; space>=line; space--)
    	System.out.print(" ");
      
      for (int space=line; space<10; space++)
        System.out.print(" ");
      
      for (int star1=1; star1<=line; star1++)
    	System.out.print("*");
      
      System.out.println();
    }
    
    for(int line=9; line>=1;line--)
    {
      for(int star=1; star<=line; star++)
        System.out.print("*");
      
      for(int space=(10-line); space>=1; space--)
        System.out.print(" ");
      
      for (int space=1; space<=(10-line); space++)
    	System.out.print(" ");
      
      for (int star=1; star<=line; star++)
    	System.out.print("*");
      
      System.out.println();
    }
    
      System.out.println();
  }
  
  
  public static void main(String[] args) {
    	
      butterflyPattern();
    
  }
}
