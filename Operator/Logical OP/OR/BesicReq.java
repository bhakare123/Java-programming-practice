class BesicReq
{
  public static void main(String args[])
  {
    //Requirement
    double salary = 1000000;
    double assets = 50000000;
    
    //having 
    double rahulSalary = 200000;
    double rahulAssect = 100000000;

    boolean match = ((rahulSalary >= salary) || (rahulAssect >= assets));
    System.out.println(match);       //true
  }
}