/*
*****
*
*****
    *
*****   */

class Demo9
{
  public static void main(String args[])
  {
    int row = 5;
    int col = 5;
    
    for(int i=1; i<=row ; i++)
    {
      for(int j = 1; j<=col ; j++)
      {
        if(i%2!=0)
           System.out.print("*");
        else if(i == 2 && j == 1)
           System.out.print("*");
        else if(i == 4 && j == 5)
           System.out.print("*");
        else
           System.out.print(" ");
      }
      System.out.println();
    }
  }
}