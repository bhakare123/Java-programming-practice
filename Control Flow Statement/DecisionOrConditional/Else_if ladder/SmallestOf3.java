import java.util.Scanner;
class SmallestOf3
{
  public static void main(String arg[])
  {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a Number 1 :-  ");
    int num1 = sc.nextInt();
    
    System.out.println("Enter a Number 2 :-  ");
    int num2 = sc.nextInt();
    
    System.out.println("Enter a Number 3 :-  ");
    int num3 = sc.nextInt();
    
    
    if(num1<num2 && num1<num3)
    {
      System.out.println(num1+" is smaller");
    }
    else if(num2<num3)
    {
      System.out.println(num2+" is smaller");
    }
    else
    {
      System.out.println(num3+" is smaller");
    }
  }
}