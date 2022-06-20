package starPattern;

public class PyramidPattern {
  
//(Note: Only Outer for loop value changes between both programs.Inner for loop remains same.)

  //Using Instance Method
	
  public static void pyramid() {
	  
	System.out.println("PYRAMID");
	System.out.println();
	  
    for (int line=1; line<=10; line++)                //for number of rows/lines
	{
	    for (int space=(10-line); space>=1; space--)  //for decreasing space triangle
	    System.out.print(" ");
  
	    for (int star=1; star<=line; star++)         //for increasing star pattern
	    System.out.print("* ");                      //space after star for pyramid

	  System.out.println();
	}
    
      System.out.println();
  }
      
//-------------------------------------------------------------//
    
  public static void reversePyramid() {
  
    System.out.println("REVERSE PYRAMID");
    System.out.println();

    for (int line=10; line>=1; line--)                
    {
        for (int space=(10-line); space>=1; space--)  
        System.out.print(" ");
      
        for (int star=1; star<=line; star++)         
        System.out.print("* ");                      

      System.out.println();
    }
    
      System.out.println();
  }
  
  
  public static void main(String[] args) {
	  
	  pyramid();
	  reversePyramid();
  }
}
