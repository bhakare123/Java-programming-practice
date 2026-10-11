class SmallestOf4
{
  public static void main(String args[])
  {
    int a = 100;
    int b = 10;
    int c = 8;
    int d = 220;

    int res = (a<b && a<c && a<d ? a : (b<c && b<d ? b : (c<d ? c:d)));
    System.out.println(res);
  }
}