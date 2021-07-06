//1)Using Command Line arguments

import java.lang.*;

class DAPP1
{
 public static void main(String[] args)
 {
   int a = Integer.parseInt(args[0]);
   
   int b = Integer.parseInt(args[1]);
    
	int c = a+b;
	
	System.out.println("Sum of "+a+" and "+b+" is "+c);
	
   String name = args[2];
    System.out.println("Welcome , "+name);   
   
 }
}

/*

javac DAPP1.java
java DAPP1 11 22 James

*/