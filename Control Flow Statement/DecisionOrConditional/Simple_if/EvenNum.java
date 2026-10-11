import java.util.Scanner;
class EvenNum
{
  public static void main(String arg[])
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a Number :-  ");
    int num1 = sc.nextInt();
    
    if(num1 % 2 == 0)
    {
      System.out.println("Number is Even "+num1);
    }
  }
}
    