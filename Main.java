import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("We are having a 20% off sale rn");
    //you insert the price of the product here in a decimal form
    System.out.println("what is the price of your item? ");
    double price = scan.nextDouble();
//total price of every product you ordered after you enter 0 into the method
    System.out.println("your total price is " + dis(price));
  }
//this gets the discounted price
  public static double dis(double price ) {
    Scanner scan = new Scanner(System.in);
    if (price > 0) {
      //the equation to get the discounted price and put it into a variable
       double D = price * 0.20;
      double discountPrice = price - D;
      //print statement for repeating the price for extra items
      System.out.println("will you be buying another item? Please enter the price of the new item otherwise enter 0");
      price = scan.nextDouble();
      //makes the code repeat until 0 is entered.
      return discountPrice + dis(price);  
  } else {
      return 0;
  }
}

}
//notes for myself (unreleated to the coding)
// working with discounts
// multply then subtract from the original price
// add print for og and maybe discount
