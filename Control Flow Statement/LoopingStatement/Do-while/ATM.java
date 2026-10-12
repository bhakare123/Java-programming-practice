import java.util.Scanner;

class ATM
{
   public static void main(String args[])
   {
      int pass;
      Scanner sc = new Scanner(System.in);
       
      do
      {
        System.out.println("Enter a Password");
        pass = sc.nextInt();
        if(pass != 1234)
           System.out.println("Wrong Password");
      }
      while(pass != 1234);
    
      System.out.println("Enjoy..........");  
   }
}