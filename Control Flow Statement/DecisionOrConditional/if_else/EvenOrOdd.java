import java.util.Scanner;
class EvenOrOdd
{
  public static void main(String arg[])
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a Number :-  ");
    int num = sc.nextInt();

    if(num%2==0)
    {
      System.out.println("Number is Even :- "+num);
    }
    else
    {
      System.out.println("Number is odd :- "+num);
    }
  }
}