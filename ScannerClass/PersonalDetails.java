import java.util.Scanner;
class PersonalDetails
{
  public static void main(String arg[])
  {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the Name :- ");
    String name = sc.next();

    System.out.println("Enter the Age :- ");
    int age = sc.nextInt();

    System.out.println("Enter the Gender :- ");
    char gender = sc.next().charAt(0);
    
    System.out.println("Enter the mobile number :- ");
    long mob = sc.nextLong();
    
    System.out.println("Enter the Percentage :- ");
    double per = sc.nextDouble();
    
    System.out.println("Enter the Address :- ");
    String add = sc.next();

    System.out.println("Enter the Email :- ");
    String email = sc.next();
   
    System.out.println("*************************************************************");

    System.out.println("Name :- "+name);
    System.out.println("Age :- "+age);
    System.out.println("Gender :- "+gender);
    System.out.println("Mobile :- "+mob);
    System.out.println("Percentage :- "+per);
    System.out.println("Address :- "+add);
    System.out.println("Email :- "+email);
  }

}