class CountOfEvenDigits
{
  public static void main(String args[])
  {
    long num =289123456789L;
    int count =0;
    while(num!=0)
    {
       long rem = num%10;
       if(rem%2==0)
          count++;
       num/=10;
    }
    System.out.println("number of even digits are : "+count);
   }
}