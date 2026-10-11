import java.util.Scanner;
class PositiveNigitiveMixx
{
  public static void main(String arg[])
  {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a num1 :-  ");
    int num1 = sc.nextInt();

    System.out.println("Enter a num2 :-  ");
    int num2 = sc.nextInt();
   
    System.out.println("Enter a num3 :-  ");
    int num3 = sc.nextInt();
    
    if (num1 >0 && num2 >0 && num3 >0 || num1<0 && num2<0 && num3<0)
    {
      System.out.println("All are positive or Negative");
    }
    else
    {
       System.out.println("All are Mix");
    }
   }
}
    