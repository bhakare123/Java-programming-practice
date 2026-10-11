/*
  1 2 3 4 5
  5 4 3 2 1
  1 2 3 4 5
  5 4 3 2 1
  1 2 3 4 5 */

class Demo5
{
  public static void main(String args[])
  {
    int rows = 5;
    int colums = 5;
    for(int i=1; i<=rows; i++)
    {
      for(int j=1; j<=colums; j++)
      {
        if(i % 2 != 0)
            System.out.print(j + " ");
        else
            System.out.print((6-j)+" ");
      }
      System.out.println();
    }
    
  }

}