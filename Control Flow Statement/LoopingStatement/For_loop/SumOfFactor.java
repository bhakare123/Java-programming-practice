//WAJP to print sum of factor of given number

import java.util.Scanner;
class SumOfFactor
{
   public static void main(String args[])
   {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter a number :");
     int input = sc.nextInt();

     int sum =0;
     for (int a = 1; a<=input; a++)
     {
       if(input%a==0)
       {
          sum+=a;           // sum = sum +a  
       }
     }
     System.out.println("Sum of Factor : "+sum);
     
   }
}