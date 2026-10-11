class UpperOrLower
{
  public static void main(String args[])
  {
    char ch = '+';
    String res = (ch >= 'A' && ch <= 'Z' ? "Uppercase...." :(ch >= 'a' && ch <= 'z' ? "Lowercase" : "Invalid input"));
    System.out.println(res);
  }
}