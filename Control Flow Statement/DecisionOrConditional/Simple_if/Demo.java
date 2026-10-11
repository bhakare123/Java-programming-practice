import java.util.Scanner;
class Demo
{
  public static void main(String arg[])
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Jersey No :- ");
    int jersey = sc.nextInt();
    
    if(jersey == 18)
    {
      System.out.println("King ......");
    }

    if(jersey == 1)
    {
      System.out.println("Classic KL");
    }
  }
}