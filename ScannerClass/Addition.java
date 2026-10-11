import java.util.Scanner;
class Addition
{
  public static void main(String arg[])
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter 1st number :- ");
    int num1 = sc.nextInt();
    
    System.out.println("Enter 2nd number :- ");
    int num2 = sc.nextInt();
    
    System.out.println("Sum of two number : "+(num1 + num2));
    System.out.println("Thank you");
  }
}