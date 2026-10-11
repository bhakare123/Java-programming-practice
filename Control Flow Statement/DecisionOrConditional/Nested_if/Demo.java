import java.util.Scanner;
class Demo
{
  public static void main(String arg[])
  {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a Number :-  ");
    int num = sc.nextInt();
   
    if(num > 0)
    {
      System.out.println("Number is Positive Number");
      if(num%2==0)
      {
         System.out.println("Number is Even");
      }
      else
      {
         System.out.println("Number is Odd");
      }
    }
    else
    {
      if(num ==0)
      {
         System.out.println("Number is Zero");
      }
      else 
      {
        System.out.println("Number is Negative Number");

      }
    }
  }
}