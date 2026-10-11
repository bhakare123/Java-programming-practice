class AlphabetOrNumberOrSpechilChar
{
  public static void main(String args[])
  {
    char ch = '0';

    String res = (ch>='A' && ch<='Z' || ch >='a' && ch <='z') ? "Alphabet ...." : (ch >='0' && ch<='9')? "number ..." : "Spechial.." ;
    
   System.out.println(res);
  }
}