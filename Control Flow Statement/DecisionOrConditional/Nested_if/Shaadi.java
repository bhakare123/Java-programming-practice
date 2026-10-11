import java.util.Scanner;
class Shaadi
{
  public static void main(String arg[])
  {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a Name :-  ");
    String name = sc.next();
    
    System.out.println("Enter a Age :-  ");
    int age = sc.nextInt();
   
    System.out.println("Enter a Gender :-  ");
    char gender = sc.next().charAt(0);

    System.out.println();

    if(gender == 'M' || gender == 'm')
    {
      System.out.println("Enter a Salary :-  ");
      double sal = sc.nextDouble();
     
      if(age>=25 && sal >200000.00)
      {
        System.out.println(name+" Eligible");
      }
      else
      {
        System.out.println(name+" Not Eligible");
      }
     }
     else
     {
       if(gender == 'f' || gender =='F')
       {
          if(age >23)
          {
             System.out.println(name+" Eligible");
          }
          else
          {
            System.out.println(name+" Not Eligible");
          }
       }
      }
    }
}