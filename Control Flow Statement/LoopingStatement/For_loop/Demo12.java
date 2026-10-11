class Demo12
{
  public static void main(String args[])
  {
    for(int i = 1; i <= 50; i++)
    {
       int pos = (i - 1) % 10 + 1;

       if(((i - 1) / 10) % 2 == 0)
          System.out.print(pos + " ");
       else
          System.out.print((11 - pos) + " ");

       if(i % 10 == 0)
          System.out.println();
    }
  }
}