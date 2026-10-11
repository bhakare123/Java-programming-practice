// WAJP to print players name by using swithch statement

import java.util.Scanner;
class Player
{
     public static void main(String args[])
   {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter a Jersay No. : ");
     int jersey = sc.nextInt();

    switch(jersey)
    {
      case 1:
      {
        System.out.println("KLRahul"); 
      }break;
      case 18:
      {
        System.out.println("CHIKU"); 
      }break;
      case 45:
      {
        System.out.println("Bade Bhaiya"); 
      }break;
      default:
      {
        System.out.println("Invalid"); 
      }break;
    }
  }
}