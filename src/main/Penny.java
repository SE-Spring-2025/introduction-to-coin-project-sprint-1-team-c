public class Penny extends Coin {
    public final double pennyValue = .01;

    public Penny() {
	this.value = pennyValue;
	this.metallurgy = new Copper();
	this.familiarName = "Penny";
    }

    public Penny(int year) {
	this.value = pennyValue;
	this.familiarName = "Penny";
	this.metallurgy = new Copper();
	this.manufactureYear = year;
    }

    protected Coin smelt(Coin c) {
        c.metallurgy.smelt(); 
        return c;
    }

    protected Coin edge(Coin c) {
        c.ridgedEdge = false;
        return c;
    }

    protected Coin imprintFrontImage(Coin c) {
        c.frontImage = "A_Lincoln";
        return c;
    }

    protected Coin imprintFrontMotto(Coin c) {
        c.frontMotto = "IN GOD WE TRUST";
        c.frontLabel = "LIBERTY";
        c.manufactureYear = manufactureYear;
        return c;
    }

    protected Coin imprintBack(Coin c) {
        c.backImage = "Lincoln_Memorial";
        c.backMotto = "E PLURIBUS UNUM";
        c.backLabel = "UNITED STATES OF AMERICA";
        c.valueDescription = "ONE CENT";
        return c;
    }
}
