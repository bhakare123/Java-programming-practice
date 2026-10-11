import java.util.Scanner;
class VowelOrConsonant
{
  public static void main(String arg[])
  {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a input :-  ");
    char ch = sc.next().charAt(0);

    if(ch =='A' || ch=='E' || ch=='I' || ch=='O' || ch =='U'|| ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
    {
      System.out.println(ch+" is a Vowel ");
    }
    else
    {
       System.out.println(ch+" is Consonant ");
    }
  }
}