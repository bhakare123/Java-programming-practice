class Demo1
{
  public static void main(String arg[])
  {
    int a = 10 ;
    a--;
    System.out.println(a);
    
    ///////////////////////////////////////////
   
    int b = 10;
    int c = a--;   
    System.out.println(b);       //10
    System.out.println(c);       //9
   
  }
}