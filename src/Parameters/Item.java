package Parameters;

import java.util.Scanner;

public class Item {
	Scanner userInput = new Scanner(System.in);
	;
	Double price = userInput.nextDouble();
	
	
	
	public static void main(String[] args)
	{
		System.out.println("Enter the item price:");
		Item itm = new Item();
		System.out.println("12%:$" + itm.getDiscountPrice(0.12));
		System.out.println("20%:$" + itm.getDiscountPrice(0.20));
		System.out.println("25%:$" + itm.getDiscountPrice(0.25));
		System.out.println("35%:$" + itm.getDiscountPrice(0.35));
		System.out.println("50%:$" + itm.getDiscountPrice(0.50));
		System.out.println("75%:$" + itm.getDiscountPrice(0.75));
	}
	
	double getDiscountPrice(double discountPercentage) {
		double discount = price * discountPercentage;
		double discountPrice = price - discount;
		return discountPrice;
	}
	
}
