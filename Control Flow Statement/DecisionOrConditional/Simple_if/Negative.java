import java.util.Scanner;
class Negative
{
  public static void main(String arg[])
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a Number :-  ");
    int b = sc.nextInt();

    if(b<0)
    {
      System.out.println("Number is Negative "+b);
    }
  }
}