//WAJP to print factor of given number

import java.util.Scanner;
class Factor
{
   public static void main(String args[])
   {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter a number :");
     int input = sc.nextInt();

     for (int a = 1; a<=input; a++)
     {
       if(input%a==0)
       {
           System.out.println(a);
       }
     }
     
   }
}