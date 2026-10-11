class GreatestOf3
{
  public static void main(String args[])
  {
    int a = 10;
    int b = 20;
    int c = 14;
   
    int res = ((a>b? (a>c?a:c):(b>c ? b:c)));
    System.out.println(res);

    int res2 = (a>b && a>c ? a : (b>c ? b:c));
    System.out.println(res2);
  }
}