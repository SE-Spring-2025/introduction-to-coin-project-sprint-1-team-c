public class Demo {
        public static void main(String[] args) {
        
	System.out.println("Demo of the Coins classes");


	Penny pennyCoin = new Penny();
	System.out.println("Here is a penny: " + pennyCoin.toString());

	Nickel nickelCoin = new Nickel();
	System.out.println("Here is a nickel: " + nickelCoin.toString());
	
	Dime dimeCoin = new Dime();
	System.out.println("Here is a dime: " + dimeCoin.toString());

	Quarter quarterCoin = new Quarter();
	System.out.println("Here is a Quarter: " + quarterCoin.toString());

	HalfDollar halfDollarCoin = new HalfDollar();
	System.out.println("Here is a half dollar: " + halfDollarCoin.toString());

	Dollar dollarCoin = new Dollar();
	System.out.println("Here is a dollar: " + dollarCoin.toString());

	System.out.println("A penny is made of " + pennyCoin.getMetallurgy());
	System.out.println("A nickle is made of " + nickelCoin.getMetallurgy());
	System.out.println("A dime is made of " + dimeCoin.getMetallurgy());
	System.out.println("A quarter is made of " + quarterCoin.getMetallurgy());
	System.out.println("A halfDollar is made of " + halfDollarCoin.getMetallurgy());
	System.out.println("A dollar is made of " + dollarCoin.getMetallurgy());
 }
}
