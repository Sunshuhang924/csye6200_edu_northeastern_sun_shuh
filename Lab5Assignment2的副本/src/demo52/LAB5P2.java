package demo52;

public class LAB5P2 {
	
    public static void main(String[] args) {
    	System.out.println("Created the following stocks:");
    	Stock apple = new Stock("AAPL");
    	apple.setValue(150); 
    	apple.setQuantity(30); 
    	System.out.println(apple);
 
		Stock meta = new Stock("META");
		meta.setValue(300);
		meta.setQuantity(15); 
		System.out.println(meta);
		 
		 // print all at the beginning
		System.out.println("Total Stock Value: " + Stock.getTotalValue());
		
		 // update Apple stock quantity
		System.out.println("\nUpdating the quantity of Apple stock");
		 apple.setQuantity(10); // update quantity to 10 
		System.out.println(apple);
		System.out.println("Total Stock Value: " + Stock.getTotalValue());
		
		 // update meta stock unit price
		System.out.println("\nUpdating the value of Meta stock");
		meta.setValue(400); // update price to $100 per stock
		System.out.println(meta);
		System.out.println("Total Stock Value: " + Stock.getTotalValue());
    }
	
}

class Stock {
	
	public String getSymbol() {
		return symbol;
	}

	public int getValue() {
		return value;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setValue(int newValue) {
		updateTotalValue(value, quantity, newValue, quantity);
		this.value = newValue;
	}

	public void setQuantity(int newQuantity) {
		updateTotalValue(value, quantity, value, newQuantity);
		this.quantity = newQuantity;
	}

	String symbol;
	@Override
	public String toString() {
		return "Stock [" + symbol + ", value: $" + value + ", quantity: " + quantity + "]";
	}
	int value;
	int quantity;
	static int totalValue;
	
	public Stock(String symbol) {
		this.symbol = symbol;
	}
	
	public static int getTotalValue() {
		return totalValue;
	}
	
	public static void updateTotalValue(int oldValue, int oldQuantity, int newValue, int newQuantity) {
		totalValue = totalValue + (newValue * newQuantity) - (oldValue * oldQuantity);
	}
		
}	