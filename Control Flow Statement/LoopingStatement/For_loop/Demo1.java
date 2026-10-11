//WAJP to print natural number from 1 to 10

import java.util.Scanner;
class Demo1
{
   public static void main(String args[])
   {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter a starting point : ");
     int start = sc.nextInt();
     System.out.println("Enter a ending point : ");
     int end = sc.nextInt();
    
     for(int i=start; i<=end; i++)
     {
       System.out.println(i);
     }
   }
}