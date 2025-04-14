import javax.swing.*;
import java.awt.*;
import java.util.Observable;
import java.util.Observer;

public class CoinCounter extends JFrame implements Observer {
    private JLabel totalLabel;
    private JLabel quarterLabel;

    public CoinDashboard(CoinCounts counts) {
        setTitle("Coin Dashboard");
        setLayout(new FlowLayout());

        totalLabel = new JLabel("Total Coins: 0");
        quarterLabel = new JLabel("Quarters: 0");

        add(totalLabel);
        add(quarterLabel);

        setSize(250, 120);
        setVisible(true);

        counts.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof CoinCounts) {
            CoinCounts cc = (CoinCounts) o;
            totalLabel.setText("Total Coins: " + cc.getTotal());
            quarterLabel.setText("Quarters: " + cc.getQuarters());
        }
    }
}
