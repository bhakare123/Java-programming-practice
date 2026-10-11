class FCRoad
{
  public static void main(String args[])
  {
    double budget = 1000;
    String color = "Black";
    char size = 'l';

    double shirtPrize = 599;
    String shirtColor = "Black";
    char shirtSize ='l';

    boolean res = (budget >= shirtPrize) &&
                  (color == shirtColor) &&
                  (size == shirtSize);

    System.out.println(res);    // true 
  }
}
