class Demo7
{
 public static void main (String args[])
  {
    int a = 10;       //10,11,12
    a++;   
    int b = a++;      //11,12
    System.out.println(b);   //11
    System.out.println(b++);  //11

   System.out.println(a); //12
   System.out.println(b); //12
  
  }
}