import java.util.Scanner;
class BothEqual
{
  public static void main(String arg[])
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a 1st Number :-  ");
    int num1 = sc.nextInt();

    System.out.println("Enter a 2nd Number :-  ");
    int num2 = sc.nextInt();

    if(num1==num2)
    {
      System.out.println("Number are equal");
    }
  }
}