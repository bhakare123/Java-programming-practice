class checkAlphabet
{
   public static void main(String args[])
   {
     char ch = 'a';
     boolean res = (ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z');

     System.out.println(res);        // true
   }
}