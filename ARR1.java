//single dim array demo

import java.lang.*;

class ARR1
{
 public static void main(String[] args)
 {

   int[] x = new int[]{10,20,30,40,50,60,70,80,90};

   System.out.println("Array Size : "+x.length);

   for(int i=0;i< x.length;i++)
   {
     System.out.print("x["+i+"]=");
     System.out.println(x[i]);
   }
  
 }
}

