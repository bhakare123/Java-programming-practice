/*
A B C D E
F G H I J
K L M N O
P Q R S T
U V W X Y 
          */
class Demo3
{
  public static void main(String args[])
  {
    int rows = 5;
    int colums = 5;
    char ch = 'A';
    for(int i=1; i<=rows; i++)
    {
      for(int j=1; j<=colums; j++)
      {
        System.out.print(ch++ +" ");
      }
      System.out.println();
    }
    
  }
}