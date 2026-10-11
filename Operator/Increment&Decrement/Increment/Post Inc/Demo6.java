class Demo6
{
  public static void main (String args[])
  {
    int a = 0;    //0,1,2
    int b = a++;   //0,1
    b = a++;
    System.out.println(b);   //1
     System.out.println(a);  //2
  }
}