import java.util.Scanner;
class GamingApplication
{
  public static void main(String arg[])
  {
     Scanner sc = new Scanner(System.in);
     char cho;
     do
     {
       System.out.println("Game is loading.......");
       System.out.println("Game is Over do u want continue Y/N");
       cho = sc.next().charAt(0);
     }
     while(cho == 'Y' || cho == 'y');
    
     System.out.println("Exits....");
    
  }
}