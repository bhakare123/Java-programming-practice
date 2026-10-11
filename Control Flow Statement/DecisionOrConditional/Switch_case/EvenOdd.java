// WAJP for Even Odd using Switch case

import java.util.Scanner;
class EvenOdd
{
   public static void main(String args[])
   {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter num : ");
     int num = sc.nextInt();

     switch(num%2)
     {
       case 0:
       {
          System.out.println("Even Number");
       }break;
       case 1:
       {
          System.out.println("Odd Number");
       }
     }
   }
}
