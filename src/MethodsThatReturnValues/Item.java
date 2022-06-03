package MethodsThatReturnValues;

public class Item {
	double price = 160.0;
	
	double getDiscountPrice20(){
		double discount = price * 0.20;
		double discountPrice  = price - discount;
		return discountPrice;
	}
	
	double getDiscountPrice40() {
		double discount = price * 0.40;
		double discountPrice = price - discount;
		return discountPrice;
	}
	
	double getDiscountPrice75() {
		double discount = price * 0.75;
		double discountPrice = price - discount;
		return discountPrice;
	}
	
	public static void main(String[] args) {
		Item itm = new Item();
		System.out.println("Price with 20% $ " + itm.getDiscountPrice20());
		System.out.println("Price with 40% $ " + itm.getDiscountPrice40());
		System.out.println("Price with 75% $ " + itm.getDiscountPrice75());
	}
}
