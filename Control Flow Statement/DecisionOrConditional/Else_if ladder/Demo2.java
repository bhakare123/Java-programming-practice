import java.util.Scanner;
class Demo2
{
  public static void main(String arg[])
  {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter Character :- ");
    char ch = sc.next().charAt(0);
    
    if((ch>=65 && ch<=90) || (ch>=95 && ch<=122))
    {
       if(ch>=65 && ch<=90)
       {
         System.out.println("Upper Case");
       }
       else
       {
         System.out.println("Lower Case");
       }
     }
     else if(ch>=48 && ch<=57)
     {
       System.out.println("Number");   
     }
     else
     {
       System.out.println("Spechial Character");
     }
  }
}