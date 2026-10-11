//WAJP to print KL five time 

import java.util.Scanner;
class Demo
{
   public static void main(String args[])
   {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter a input : ");
     String input = sc.next();
     System.out.println("**********************************************");
    
     for(int i=1; i<=5; i++)
     {
       System.out.println(input);
     }
   }
}