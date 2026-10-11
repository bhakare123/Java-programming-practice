class EvenOrDivisibleBy5
{
  public static void main(String args[])
  {
    int a = 10;
    
    boolean res = (a%2==0) && (a%5==0);
    
    System.out.print(res);   // true
  }
}