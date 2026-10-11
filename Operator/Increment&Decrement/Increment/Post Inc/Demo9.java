class Demo9
{
  public static void main(String arg[])
  {
    char ch = 'a';
    ch++;
    System.out.println(ch++);     //b
    System.out.println(ch);        //c

    char z = 'a';
    z=z++;
    z=z++;
    System.out.println(z);

    int a = -10;
    a++;
    System.out.println(a);    //-9
    
    ++a;
    System.out.println(a);    //-8

  }
}