import java.util.Scanner;
class Demo3
{
  public static void main(String arg[])
  {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter Character :- ");
    char ch = sc.next().charAt(0);
    
    if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z'))
    {
       if(ch>='A' && ch<='Z')
       {
         System.out.println("Upper Case");
       }
       else
       {
         System.out.println("Lower Case");
       }
     }
     else if(ch>='0' && ch<='9')
     {
       System.out.println("Number");   
     }
     else
     {
       System.out.println("Spechial Character");
     }
  }
}