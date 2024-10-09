package demo52;

public class LAB5P1 {
	public static void main(String[] args) {
		MyInteger num1 = new MyInteger(29);
        MyInteger num2 = new MyInteger(10);

        
        System.out.println("num1 is Even? " + num1.isEven());  
        System.out.println("num1 is Odd? " + num1.isOdd());     
        System.out.println("num1 is Prime? " + num1.isPrime()); 

        char[] numbers = {'1','2','3'};
        System.out.println("parseInt(char[]) for {1,2,3} = " + MyInteger.parseInt(numbers));
        
        String s = "4567";
        System.out.println("parseInt(String) for \"4,5,6,7\" = " + MyInteger.parseInt(s));
        
        System.out.println("num2 is Even? " + num2.isEven());   
        System.out.println("num2 is Odd? " + num2.isOdd());    
       
        System.out.println("num1 is equal to num2? " + num1.equals(num2));   
        System.out.println("num1 is equal to 29? " + num1.equals(29)); 

        
		
	}
}

class MyInteger {
	
	//data field
	int value;
	
	// constructor
	public MyInteger(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
	
	
	public boolean isEven() {
		return value % 2 == 0;
	}

	public static boolean isEven(int n) {
		return n % 2 == 0;
	}
	
	public static boolean isEven(MyInteger o) {
		return o.getValue() % 2 == 0;
	}

	public boolean isOdd() {
		return value % 2 == 1;
	}

	public static boolean isOdd(int n) {
		return n % 2 == 1;
	}

	public static boolean isOdd(MyInteger n) {
		return n.getValue() % 2 == 1;
	}

	public boolean isPrime() {
		return isPrime(value);
	}

	public static boolean isPrime(int num) {
		if (num <= 0) return false;
		for (int i = 2; i < Math.sqrt(num); i++) {//'i < Math.sqrt(num)' is quite efficient
			if (num % i == 0) return false;
			else continue;
		}
		return true;
	}

	public static boolean isPrime(MyInteger o) {
		return isPrime(o.getValue());
	}
	
	public boolean equals(int anotherNum) {
		
		return value == anotherNum;
	}

	public boolean equals(MyInteger o) {
		
		return value == o.getValue();
	}

	public static int parseInt(char[] numbers) {
		// numbers consists of digit characters.
		// For example, if numbers is {'1', '2', '5'}, the return value
		// should be 125. Please note that
		// numbers[0] is '1'
		// numbers[1] is '2'
		// numbers[2] is '5'			
		int result = 0;
        for (char c : numbers) {
            result = result * 10 + (c - '0');
        }
        return result;
	}

	public static int parseInt(String s) {
		// s consists of digit characters.
		// For example, if s is "125", the return value
		// should be 125.
		
		int result = 0;
		for (int i = 0; i < s.length(); i++) {
			result = result * 10 + s.charAt(i) - '0';
		}
		return result;
	}
}