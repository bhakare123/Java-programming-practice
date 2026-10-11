class ReverseNumber
{
  public static void main(String arg[])
  {
    int num = 9696;
    int res = 0;
    
    while(num!=0)
    {
      int rem = num%10;
      res = 10*res+rem;
      num = num/10;
      
    }
    System.out.println(res);
  }
}