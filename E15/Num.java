class Num
{
  public static void main(String [] args)
  {
      int i = 1 ;
      int n = 100;
      int  count = 0;
     
      while(i<=100)
      {
         if(i % 18 == 0 || count ==3)
         {
                    count++;
                    system.out.println("found 3rd multiple of 18 is " +count);
 
                     break;
         } 
         else if(i % 7 ==0)
         {
             system.out.println(i);
         }
         i++;
      }
   }   
}
