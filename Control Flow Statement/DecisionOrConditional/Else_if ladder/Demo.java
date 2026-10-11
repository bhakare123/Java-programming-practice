import java.util.Scanner;
class Demo
{
  public static void main(String arg[])
  {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a Number 1 :-  ");
    int num1 = sc.nextInt();

    System.out.println("Enter a Number  :-  ");
    int num2 = sc.nextInt();
   
   if(num1>num2)
   {
      System.out.println(num1+" Greater than "+num2);
   }
   else if(num2>num1)
   {
     System.out.println(num2+" Greater than "+num1);
   }
   else
   {   
     System.out.println(num1+" Are equal "+num2);
   }
 }
}
    
    