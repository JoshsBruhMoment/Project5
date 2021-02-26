import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("We are having a 20% off sale rn");
    System.out.println("what is the price of your item? ");
    double price = scan.nextDouble();

    System.out.println("your total price is " + dis(price));
  }

  public static double dis(double price ) {
    Scanner scan = new Scanner(System.in);
    if (price > 0) {
       double D = price * 0.20;
      double discountPrice = price - D;  
      System.out.println("will you be buying another item? Please enter the price of the new item otherwise enter 0");
      price = scan.nextDouble();
      return discountPrice + dis(price);  
  } else {
      return 0;
  }
}

}

// working with discounts
// multply then subtract from the original price
// add print for og and maybe discount
