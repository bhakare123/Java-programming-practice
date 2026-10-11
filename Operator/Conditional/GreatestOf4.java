class GreatestOf4
{
  public static void main (String args[])
  {
    int a =10;
    int b = 220;
    int c = 30;
    int d = 40;
   
    int res = (a>b && a>c && a>d ? a : (b>c && b>d ? b : (c>d ? c:d)));
    System.out.println(res);
  }
}