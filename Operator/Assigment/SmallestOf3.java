class SmallestOf3
{
  public static void main(String args[])
  {
    int a = 3;
    int b = 1;
    int c = 8;

    int res = (a<b && a<c ? a : (b<c? b:c));
    
    System.out.println(res);
  }
}