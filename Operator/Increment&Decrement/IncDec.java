class IncDec
{
  public static void main(String arg[])
  {
     int a = 1;
     int b = a++  + 5  + ++a;
     b--;
     int c = (a--) + (b++) + (++a) + (--b);
     System.out.println(c-- + 10);                  //32
     System.out.println(a++ + --b + --c);            //30
     System.out.println(++a);                         //5
     System.out.println(b--);                          //7
     System.out.println(++c);                           //21
   
  }
}