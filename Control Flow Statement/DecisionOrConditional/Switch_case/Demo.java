//Without using Break keywords 


import java.util.Scanner;
class Demo
{
   public static void main(String args[])
   {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter a Numbere : ");
     int num = sc.nextInt();

     switch(num)
     {
       case 1 :
       {  
         System.out.println("One"); 
       }
       case 2 :
       {  
         System.out.println("Two"); 
       }
       case 3 :
       {  
         System.out.println("Three"); 
       }
       default:
       {  
         System.out.println("Invalid Opetion"); 
       }

     }
   }
}