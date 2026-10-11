class Demo8
{
 public static void main(String args[])
 {
   int a = 10; 
   a++;
   int b = a++ + 10;
   int c = (a++) + (b++);
   System.out.println(c);   //33
   System.out.println(b++);  //22
   System.out.println(a++);  //13
   System.out.println(c++);  //33
 }
}