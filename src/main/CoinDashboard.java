import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.FlowLayout;

public class CoinDashboard extends JFrame implements Observer {
    private JLabel totalLabel;
    private JLabel quarterLabel;
    private JLabel pennyLabel;
    private JLabel nickelLabel;
    private JLabel dimeLabel;
    private JLabel halfDollarLabel;
    private JLabel dollarLabel;
    private Coin.CoinCounter counts;
    private final int width = 250;
    private final int height = 120;


    public CoinDashboard(Coin.CoinCounter counts) {
        this.counts = counts;
        setTitle("Coin Dashboard");
        setLayout(new FlowLayout());

        totalLabel = new JLabel("Total Coins: 0");
        quarterLabel = new JLabel("Quarters: 0");
        pennyLabel = new JLabel("Pennies: 0");
        nickelLabel = new JLabel("Nickels: 0");
        dimeLabel = new JLabel("Dimes: 0");
        halfDollarLabel = new JLabel("Half Dollars: 0");
        dollarLabel = new JLabel("Dollars: 0");

        add(totalLabel);
        add(quarterLabel);
        add(pennyLabel);
        add(nickelLabel);
        add(dimeLabel);
        add(halfDollarLabel);
        add(dollarLabel);

        setSize(width, height);
        setVisible(true);

        counts.registerObserver(this);
    }

    public void update() {
        totalLabel.setText("Total Coins: " + counts.getTotalCoins());
        quarterLabel.setText("Quarters: " + counts.getQuarters());
        pennyLabel.setText("Pennies: " + counts.getPennies());
        nickelLabel.setText("Nickels: " + counts.getNickels());
        dimeLabel.setText("Dimes: " + counts.getDimes());
        halfDollarLabel.setText("Half Dollars: " + counts.getHalfDollars());
        dollarLabel.setText("Dollars: " + counts.getDollars());
        
    }
}
