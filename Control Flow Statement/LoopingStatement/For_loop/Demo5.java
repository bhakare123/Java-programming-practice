//WAJP to print even number from 1 to 10     using Break
class Demo5
{
   public static void main(String args[])
   {
     for (int a = 1; a<=10; a++)
    {
       if(a%2==0)
       {
           System.out.println(a);
           break;
       }
     }
     
   }
}