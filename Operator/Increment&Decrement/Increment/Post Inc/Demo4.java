class Demo4
{
  public static void main(String arg[])
  {
    int a = 10;    //11,12
    int b = a++;    // 10,11
    
    System.out.println(a++);  //11
    System.out.println(b++);   //10
    System.out.println(a);    //12
    System.out.println(b);    //11
    
  }
}