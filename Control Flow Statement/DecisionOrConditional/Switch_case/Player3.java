import java.util.Scanner;

class Player3
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
        double sal = 300000;
        System.out.println(sal);
      }break;
      case 18:
      {
        double sal = 500000;
        System.out.println(sal); 
      }                              //now we add block 
     }
   }
}