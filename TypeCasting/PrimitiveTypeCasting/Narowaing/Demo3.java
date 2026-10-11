class Demo3
{
  public static void main (String arg[])
  {
   //Widening
    long a = 561;
    float b = a;            //  implict typecasting
    System.out.println(b);   // 56.6 float data 
  
   // Narrowing
   float c = 65.6f;
   long d = (long)c;             //explict typecasting 
   System.out.println(d);         // 65 long data 
   
  }
}