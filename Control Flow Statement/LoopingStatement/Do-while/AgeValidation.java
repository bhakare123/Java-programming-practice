import java.util.Scanner;

class AgeValidation
{
  public static void main(String args[])
  {
     Scanner sc = new Scanner(System.in);
     int age ;

     do
     {
       System.out.println("Enter your Age :- ");
       age = sc.nextInt();
     }
     while(age<18);

     System.out.println("Enjoy......");
  }
}