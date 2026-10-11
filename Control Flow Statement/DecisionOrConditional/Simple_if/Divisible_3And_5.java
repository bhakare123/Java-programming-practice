import java.util.Scanner;
class Divisible_3And_5
{
  public static void main(String arg[])
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a Number :-  ");
    int num = sc.nextInt();

    if(num%3==0 && num%5==0)
    {
      System.out.println("Number is Divisible by 3 and 5");
    }
  }
}