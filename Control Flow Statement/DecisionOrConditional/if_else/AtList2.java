import java.util.Scanner;
class AtList2
{
  public static void main(String arg[])
  {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a num1 :-  ");
    int num1 = sc.nextInt();

    System.out.println("Enter a num2 :-  ");
    int num2 = sc.nextInt();
   
    System.out.println("Enter a num3 :-  ");
    int num3 = sc.nextInt();
   
    if(num1 == num2 || num1 == num3 || num2 == num3)
    {
       System.out.println("At least two numbers are same ");
    }
    else
    {
      System.out.println("All numbers are different ");
    }
  }
}