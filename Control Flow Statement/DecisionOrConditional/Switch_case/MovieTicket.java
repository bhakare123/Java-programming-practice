// WAJP for Movie Ticket

import java.util.Scanner;
class MovieTicket
{
   public static void main(String args[])
   {
     Scanner sc = new Scanner(System.in);

     System.out.println("**************Movie Ticket********************");
     System.out.println("1. Recliner");
     System.out.println("2. Gold");
     System.out.println("3. Silver");
     System.out.println("4. Classic");

    System.out.println("Enter your choice!");
    int choice = sc.nextInt();

     switch(choice)
     {
       case 1:
       {  
         System.out.println("Recliner Ticket price = 500");
       }break;
       case 2:
       {  
         System.out.println("Gold Ticket price = 350");
       }break;
       case 3:
       {  
         System.out.println("Silver Ticket price = 250");
       }break;
       case 4:
       {  
         System.out.println("Classic Ticket price = 150");
       }break;
       default:
       {  
         System.out.println("Invalid Choice");
       }
     }
   }
}
    