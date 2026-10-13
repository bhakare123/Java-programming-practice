class DemoContinue
{
  public static void main(String arg[])
  {
    for(int i=1; i<=10; i++)
    {
       if(i==3 || i==6 || i==9)
       {
         continue;
       }
      System.out.println(i);
    }
  }
  
}