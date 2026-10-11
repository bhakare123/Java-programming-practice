class Demo2
{
  public static void main(String args[])
  {
    int a = 10;
    ++a;
    int b = (++a) + 10 ;
    int c = (++b) + 10 + (++a) ;
    ++c;
    System.out.println(++b);             //24
    System.out.println(c);               //47
    System.out.println(++a);             //14
  }
}