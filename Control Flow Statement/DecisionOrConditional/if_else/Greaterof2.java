import java.util.Scanner;
class Greaterof2
{
  public static void main(String arg[])
  {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a num1 :-  ");
    int num1 = sc.nextInt();

    System.out.println("Enter a num2 :-  ");
    int num2 = sc.nextInt();

    if(num1>num2)
    {
      System.out.println(num1+" is a greater than "+num2);
    }
    else
    {
       System.out.println(num2+" is a greater than "+num1);
    }
  }
}