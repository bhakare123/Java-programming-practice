class Demo1
{
  public static void main(String arg[])
  {
    int a = 10;
    ++a;
    System.out.println(a);   //11

   /////////////////////////////////////////////////////////

   int b = 10 ;
   int c = ++b;
   
   System.out.println(b);    //11
   System.out.println(c);    //11

   ////////////////////////////////////////////////////////

   int d = 10;
   System.out.println(++d);     //11
   System.out.println(d);       //11


  ///////////////////////////////////////////////////////

    int x = 0;
    x = ++x;    //1
    x = ++x;    //2
    System.out.println(x);     //2
  
  //////////////////////////////////////////////////////
  
   int x1 = 0;
   int z = ++x1;
       z = ++x1;
   System.out.println(x1);          //2
   System.out.println(z);           //2
  }
}