class ProductNoNatural
{
    public static void main(String [] args)
    {
        int i = 1;
        int n = 10;
        int product = 1;
  
        while(i<=n)
        {
             product = product * i;
             i++;
        }
             System.out.println("product of first " + n + " natural numbers is " + product);
    }
}
