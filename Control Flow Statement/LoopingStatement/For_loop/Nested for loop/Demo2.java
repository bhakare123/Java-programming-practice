/*
  1 1 1 1 1
  2 2 2 2 2
  3 3 3 3 3
  4 4 4 4 4
  5 5 5 5 5  */

class Demo2
{
  public static void main(String args[])
  {
    int rows = 5;
    int colums = 5;
    for(int i=1; i<=rows; i++)
    {
      for(int j=1; j<=colums; j++)
      {
        System.out.print(i+" ");
      }
      System.out.println();
    }
    
  }
}