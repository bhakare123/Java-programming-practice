import java.util.Scanner;
class Voting
{
  public static void main(String arg[])
  {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a Name :-  ");
    String name = sc.next();

    System.out.println("Enter a age :-  ");
    int age = sc.nextInt();

    if(age>=18)
    {
      System.out.println(name+" is eligible for voting ");
    }
    else
    {
       System.out.println(name+" is not eligible for voting ");
    }
  }
}