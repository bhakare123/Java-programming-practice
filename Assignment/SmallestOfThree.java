class SmallestOfThree
{
   public static void main(String args[])
   {
     int p = 2;
     int q = 100;
     int r = 3;
     int s = 10;
     
     int res = (p<q && p<r && p<s ? p:(q<r && q<s ? q : (r<s ? r:s)));
     System.out.println(res);
   }
}