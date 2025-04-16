import java.text.DecimalFormat;
import java.util.ArrayList;

public abstract class Coin {
    protected static CoinCounter counter = new CoinCounter();
    protected String familiarName;
    protected double value;
    protected String frontMotto;
    protected String backMotto;
    protected String frontLabel;
    protected String backLabel;
    protected String frontImage;
    protected String backImage;
    protected String valueDescription;
    protected boolean ridgedEdge;
    protected int manufactureYear;
    protected Metallurgy metallurgy;
    
    public Coin() {

    }
    public Coin(double value) {

    }
    public Coin(double value, int year) {

    }
    public String getFamiliarName() {
	return familiarName;
    }
    public double getValue() {
	return value;
    }
    public String getFrontMotto() {
	return frontMotto;
    }
    public String getBackMotto() {
	return backMotto;
    }
    public String getFrontLabel() {
	return frontLabel;
    }
    public String getBackLabel() {
	return backLabel;
    }
    public String getFrontImage() {
	return frontImage;
    }
    public String getBackImage() {
	return backImage;
    }
    public String getValueDescription() {
	return valueDescription;
    }
    public boolean getRidgedEdge() {
	return ridgedEdge;
    }
    public String getMetallurgy() {
	return metallurgy.smelt();
    }
    public int getYear() {
	return manufactureYear;
    }
    public static CoinCounter getCounter() {
        return counter;
    }
    public String toString() {
        DecimalFormat df = new DecimalFormat("0.00");
        String formattedValue = df.format(value);
	
	return "[" + familiarName
	        + "," + formattedValue
	        + "," + manufactureYear
	        + ",'" + frontMotto
	        + "','" + backMotto
	        + "','" + frontImage
	        + "','" + backImage
	        + "','" + frontLabel
	        + "','" + backLabel
	        + "','" + valueDescription
	        + "'," + (ridgedEdge ? "ridges" : "smooth")
	        + ",'" + getMetallurgy()
	        + "']";
    }

    protected static class CoinCounter implements Subject {
        private ArrayList<Observer> observers;
        private int totalCoins = 0;
        private int quarters = 0;
        
        public CoinCounter() {
            observers = new ArrayList<>();
        }

        public void registerObserver(Observer o) {
            observers.add(o);
        }
    
        public void removeObserver(Observer o) {
            observers.remove(o);
        }
    
        public void notifyObservers() {
            for (Observer observer : observers) {
                observer.update();
            }
        }

        public void addQuarter() {
            quarters++;
            totalCoins++;
            notifyObservers();
        }
        public int getQuarters() {
            return quarters;
        }
        public int getTotalCoins() {
            return totalCoins;
        }
        
    
    }
}
