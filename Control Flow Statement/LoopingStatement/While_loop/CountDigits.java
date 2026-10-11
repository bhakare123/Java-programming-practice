class CountDigits
{
  public static void main(String args[])
  {
    long num =2891234567890L;
    int count =0;
    while(num!=0)
    {
       count++;
       num/=10;
    }
    System.out.println("number of digits are : "+count);
   }
}
    