package MethodsNoReturnValues;

public class Item {

	double price = 70.0;
	
	//the following method changes the price
	void setPrice()
	{
		this.price = 80.0;
	}
	
	// this method will change the price again
	void setPriceAgain() {
		this.price *= price;
	}
	public static void main(String[] args) {
		Item itm = new Item();
		System.out.println("The price was: $"+itm.price);
		//when you invoke the method, the price will be changed
		itm.setPrice();
		System.out.println("The price is: $" + itm.price);
		itm.setPriceAgain();
		System.out.println("The price is: $" + itm.price);
	}
	
	
}
