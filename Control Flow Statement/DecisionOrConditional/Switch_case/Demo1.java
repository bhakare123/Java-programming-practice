//With using Break keywords 


import java.util.Scanner;
class Demo1
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
       }break;
       case 2 :
       {  
         System.out.println("Two"); 
       }break;
       case 3 :
       {  
         System.out.println("Three"); 
       }break;
       default:
       {  
         System.out.println("Invalid Opetion"); 
       }break;

     }
   }
}