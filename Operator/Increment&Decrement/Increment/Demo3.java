class Demo3
{
 public static void main(String args[])
 {
   int a = 10;
   int b = a++ + 10;
   ++b;
   int c = b++ + ++a;
   System.out.println(c++ + ++b);     //56
   System.out.println(a);             //12
   System.out.println(b++);           //23
   System.out.println(++c);           //33
 }
}