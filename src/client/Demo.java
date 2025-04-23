import javax.swing.*;
import java.awt.*;

public class Demo {
        public static void main(String[] args) {
        
	System.out.println("Demo of the Coins classes");

	SwingUtilities.invokeLater(() -> {
        Coin.CoinCounter counts = Coin.getCounter();
        new CoinDashboard(counts);

        JFrame frame = new JFrame("Coin Creator");
 		frame.setLayout(new FlowLayout());

        JButton quarterButton = new JButton("Add Quarter");
        JButton pennyButton = new JButton("Add Penny");
        JButton nickelButton = new JButton("Add Nickel");
        JButton dimeButton = new JButton("Add Dime");
        JButton halfDollarButton = new JButton("Add Half Dollar");
        JButton dollarButton = new JButton("Add Dollar");


        frame.add(quarterButton);
        frame.add(pennyButton);
        frame.add(nickelButton);
        frame.add(dimeButton);
        frame.add(halfDollarButton);
        frame.add(dollarButton);


        quarterButton.addActionListener(e -> {
            Coin q = new Quarter().manufacture(new Quarter());
            counts.addQuarter();
        });
        pennyButton.addActionListener(e -> {
            Coin p = new Penny().manufacture(new Penny());
            counts.addPenny();
        });
        nickelButton.addActionListener(e -> {
            Coin n = new Nickel().manufacture(new Nickel());
            counts.addNickel();
        });
        dimeButton.addActionListener(e -> {
            Coin d = new Dime().manufacture(new Dime());
            counts.addDime();
        });
        halfDollarButton.addActionListener(e -> {
            Coin hd = new HalfDollar().manufacture(new HalfDollar());
            counts.addHalfDollar();
        });
        dollarButton.addActionListener(e -> {
            Coin dol = new Dollar().manufacture(new Dollar());
            counts.addDollar();
        });

        frame.setSize(200, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
 	});

	//Demo for Sprint 5 and new Manufacture Coin Method
	// Coin originalDime = new Dime();
    // Coin manufacturedDime = originalDime.manufacture(originalDime);
    // System.out.println("Original dime: " + originalDime);
    // System.out.println("Manufactured dime: " + manufacturedDime);

	// Coin originalDollar = new Dollar();
    // Coin manufacturedDollar = originalDollar.manufacture(originalDollar);
    // System.out.println("Original dollar: " + originalDollar);
    // System.out.println("Manufactured dollar: " + manufacturedDollar);

    // Coin originalHalfDollar = new HalfDollar();
    // Coin manufacturedHalfDollar = originalHalfDollar.manufacture(originalHalfDollar);
    // System.out.println("Original half dollar: " + originalHalfDollar);
    // System.out.println("Manufactured half dollar: " + manufacturedHalfDollar);

    // Coin originalNickel = new Nickel();
    // Coin manufacturedNickel = originalNickel.manufacture(originalNickel);
    // System.out.println("Original nickel: " + originalNickel);
    // System.out.println("Manufactured nickel: " + manufacturedNickel);

    // Coin originalPenny = new Penny();
    // Coin manufacturedPenny = originalPenny.manufacture(originalPenny);
    // System.out.println("Original penny: " + originalPenny);
    // System.out.println("Manufactured penny: " + manufacturedPenny);

    // Coin originalQuarter = new Quarter();
    // Coin manufacturedQuarter = originalQuarter.manufacture(originalQuarter);
    // System.out.println("Original quarter: " + originalQuarter);
    // System.out.println("Manufactured quarter: " + manufacturedQuarter);

}
}
