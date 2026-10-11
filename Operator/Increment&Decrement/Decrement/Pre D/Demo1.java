class Demo1
{
    public static void main(String arg[])
  {
    int a = 10 ;
    --a;
    System.out.println(a);     //9
    
    ///////////////////////////////////////////
   
    int b = 10;
    int c = --a;   
    System.out.println(--b);       //8
    System.out.println(c);       //9
   
  }
}