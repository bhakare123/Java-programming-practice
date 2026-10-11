// WAJP for calculater by using switch case

import java.util.Scanner;
class Calculater
{
   public static void main(String args[])
   {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter a num1 : ");
     int num1 = sc.nextInt();
     System.out.println("Enter a num2 : ");
     int num2 = sc.nextInt();
     System.out.println("Enter operator : ");
     char operator = sc.next().charAt(0);

      switch(operator)
     {
       case '+':
       {  
         System.out.println("Addition " +(num1+num2));
       }break;
       case '-':
       {  
         System.out.println("Sub : "+(num1-num2));
       }break;
       case '*':
       {  
         System.out.println("Mul : "+(num1*num2));
       }break;
       case '/':
       {  
         System.out.println("Div "+(num1/num2));
       }break;
       case '%':
       {  
         System.out.println("Modul "+(num1%num2));
       }break;
       default:
       {  
         System.out.println("Invalid input");
       }
    }
  }
}