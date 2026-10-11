/*
A B C D E
A B C D E
A B C D E
A B C D E
A B C D E   */

class Demo4    
{
  public static void main(String args[])
  {
    int rows = 5;
    int colums = 5;
    for(int i=1; i<=rows; i++)
    {
      char ch = 'A';
      for(int j=1; j<=colums; j++)
      {
        System.out.print(ch++ +" ");
      }
      System.out.println();
    }
    
  }
}