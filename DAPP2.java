//2)Using io package
import java.lang.*;
import java.io.*;


class DAPP2
{
 public static void main(String[] args)throws IOException
 {
 
 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
  System.out.print("Enter a :");
  int a = Integer.parseInt(br.readLine()); 
  
  System.out.print("Enter b :");   
  int b = Integer.parseInt(br.readLine());
  
  	System.out.print("Enter Name :");   
   String name = br.readLine();
    
	int c = a+b;
	
	System.out.println("Sum of "+a+" and "+b+" is "+c);

    System.out.println("Welcome , "+name);   
   
 }
}

/*

javac DAPP2.java
java DAPP2 

*/