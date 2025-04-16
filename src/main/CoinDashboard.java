import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.FlowLayout;

public class CoinDashboard extends JFrame implements Observer {
    private JLabel totalLabel;
    private JLabel quarterLabel;
    private Coin.CoinCounter counts;
    private final int width = 250;
    private final int height = 120;


    public CoinDashboard(Coin.CoinCounter counts) {
        this.counts = counts;
        setTitle("Coin Dashboard");
        setLayout(new FlowLayout());

        totalLabel = new JLabel("Total Coins: 0");
        quarterLabel = new JLabel("Quarters: 0");

        add(totalLabel);
        add(quarterLabel);

        setSize(width, height);
        setVisible(true);

        counts.registerObserver(this);
    }

    public void update() {
        totalLabel.setText("Total Coins: " + counts.getTotalCoins());
        quarterLabel.setText("Quarters: " + counts.getQuarters());
        
    }
}
