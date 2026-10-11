import java.util.Scanner;
class Marks
{
  public static void main(String arg[])
  {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter Marks :- ");
    int marks = sc.nextInt();
    
    if(marks>=91 && marks<=100)
    {
     System.out.println("Excellent");
    }
    else if(marks>=75 && marks<=90)
    {
     System.out.println("Good");
    }
    else if(marks >= 35 && marks <= 74)
    {
     System.out.println("Average");
    }
    else if(marks>=0 && marks<=34)
    {
     System.out.println("Fail");
    }
    else 
    {
      System.out.println("Invalid Input");
    }
  }
}