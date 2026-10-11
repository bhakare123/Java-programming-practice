class Even_odd1
{
  public static void main(String args[])
  {
    int input = 6;
    
    String res = (input % 2 ==0? "Even":"Odd");
    System.out.println(res);  // Even
   
    System.out.println((input%2==0? 10 : "odd"));  //10
   
    //   String res2 =  (input % 2 ==0? 10:"Odd");   // CTE

   
  }
}