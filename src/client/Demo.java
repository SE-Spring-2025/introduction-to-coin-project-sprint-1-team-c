public class Demo {
        public static void main(String[] args) {
        
	System.out.println("Demo of the Coins classes");


	Penny pennyCoin = new Penny(1999);
	System.out.println("Here is a Penny: " + pennyCoin.toString());

	Nickel nickelCoin = new Nickel(2000);
	System.out.println("Here is a Nickel: " + nickelCoin.toString());
	
	Dime dimeCoin = new Dime(2010);
	System.out.println("Here is a Dime: " + dimeCoin.toString());

	Quarter quarterCoin = new Quarter(2024);
	System.out.println("Here is a Quarter: " + quarterCoin.toString());

	HalfDollar halfDollarCoin = new HalfDollar(2005);
	System.out.println("Here is a Half Dollar: " + halfDollarCoin.toString());

	Dollar dollarCoin = new Dollar(2011);
	System.out.println("Here is a Dollar: " + dollarCoin.toString());
    }
}
