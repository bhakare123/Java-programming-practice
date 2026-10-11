class PalindromeNum
{
  public static void main(String arg[])
  {
    int num = 78893;
    int num2 = num;
    int rem =0;
     
    while(num!=0)
    {
       int rev = num%10;
       rem = rem*10+rev;
       num = num/10;
    }
    if(num2 == rem)
         System.out.println("Number is Palindrome "+num2);
    else
        System.out.println("Number is Not Palindrome "+num2);
  }
}