import java.util.Scanner;
class Positive
{
  public static void main(String arg[])
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a Number :-  ");
    int a = sc.nextInt();

    if(a>0)
    {
      System.out.println("Number is Positive "+a);
    }
  }
}