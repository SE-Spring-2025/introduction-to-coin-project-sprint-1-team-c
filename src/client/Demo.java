import javax.swing.*;
import java.awt.*;

public class Demo {
        public static void main(String[] args) {
        
	System.out.println("Demo of the Coins classes");


	// Penny pennyCoin = new Penny();
	// System.out.println("Here is a penny: " + pennyCoin.toString());

	// Nickel nickelCoin = new Nickel();
	// System.out.println("Here is a nickel: " + nickelCoin.toString());
	
	// Dime dimeCoin = new Dime();
	// System.out.println("Here is a dime: " + dimeCoin.toString());
	
	// Quarter quarterCoin = new Quarter();
	// System.out.println("Here is a Quarter: " + quarterCoin.toString());
	
	// HalfDollar halfDollarCoin = new HalfDollar();
	// System.out.println("Here is a half dollar: " + halfDollarCoin.toString());

	// Dollar dollarCoin = new Dollar();
	// System.out.println("Here is a dollar: " + dollarCoin.toString());

	// System.out.println("A penny is made of " + pennyCoin.getMetallurgy());
	// System.out.println("A nickle is made of " + nickelCoin.getMetallurgy());
	// System.out.println("A dime is made of " + dimeCoin.getMetallurgy());
	// System.out.println("A quarter is made of " + quarterCoin.getMetallurgy());
	// System.out.println("A halfDollar is made of " + halfDollarCoin.getMetallurgy());
	// System.out.println("A dollar is made of " + dollarCoin.getMetallurgy());

	SwingUtilities.invokeLater(() -> {
        Coin.CoinCounter counts = Coin.getCounter();
        new CoinDashboard(counts);

        JFrame frame = new JFrame("Coin Creator");
 		frame.setLayout(new FlowLayout());

        JButton quarterButton = new JButton("Add Quarter");
        frame.add(quarterButton);

        quarterButton.addActionListener(e -> new Quarter());

        frame.setSize(200, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
 	});

	//Demo for Sprint 5 and new Manufacture Coin Method
	Coin originalDime = new Dime();
        Coin manufacturedDime = original.manufacture(originalDime);
        System.out.println("Original dime: " + originalDime);
        System.out.println("Manufactured dime: " + manufacturedDime);

	Coin originalDollar = new Dollar();
        Coin manufacturedDollar = original.manufacture(originalDollar);
        System.out.println("Original dollar: " + originalDollar);
        System.out.println("Manufactured dollar: " + manufacturedDollar);

        Coin originalHalfDollar = new HalfDollar();
        Coin manufacturedHalfDollar = original.manufacture(originalHalfDollar);
        System.out.println("Original half dollar: " + originalHalfDollar);
        System.out.println("Manufactured half dollar: " + manufacturedHalfDollar);

        Coin originalNickel = new Nickel();
        Coin manufacturedNickel = original.manufacture(originalNickel);
        System.out.println("Original nickel: " + originalNickel);
        System.out.println("Manufactured nickel: " + manufacturedNickel);

        Coin originalPenny = new Penny();
        Coin manufacturedPenny = original.manufacture(originalPenny);
        System.out.println("Original penny: " + originalPenny);
        System.out.println("Manufactured penny: " + manufacturedPenny);

        Coin originalQuarter = new Quarter();
        Coin manufacturedQuarter = original.manufacture(originalQuarter);
        System.out.println("Original quarter: " + originalQuarter);
        System.out.println("Manufactured quarter: " + manufacturedQuarter);

}
}
