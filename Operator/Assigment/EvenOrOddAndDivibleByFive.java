class EvenOrOddAndDivibleByFive
{
   public static void main(String args[])
   {
     int a= 10;
     boolean res = (a%2==0 || a%2!=0) && (a%5==0);
     System.out.println(res);            //true
   } 
}