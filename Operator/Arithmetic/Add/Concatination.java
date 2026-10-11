class Concatination
{
   public static void main(String arges[])
   {
     System.out.println(10+20);  //30
     System.out.println("10"+20+30);  // 102030
     System.out.println(10+20+"30");   // 3030
      System.out.println("10"+'A');     //10A
     System.out.println("10"+ true+10);  // 10true10
    System.out.println("10"+"20");        //1020


    String s ="Java";
    int i = 26;
    String res = s + i;
    System.out.println("Result : "+res);   // Result : Java26
     
   }
}