class Demo10
{
  public static void main(String args[])
  {
    int row = 3;
    int col = 5;
    
    for(int i=1; i<=row ; i++)
    {
      for(int j = 1; j<=col ; j++)
      {
        if(i+j>row && j-i<row)
           System.out.print("*"+" ");
        else
           System.out.print("  ");
      }
      System.out.println();
    }
  }
}