import java.util.Scanner;
class Greaterthan100
{
  public static void main(String arg[])
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a Number :-  ");
    int num = sc.nextInt();

    if(num>100)
    {
      System.out.println("Number is Greater than 100 "+num);
    }
  }
}