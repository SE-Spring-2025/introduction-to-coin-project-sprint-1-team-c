public class Quarter extends Coin {
    public final double quarterValue = .25;

    public Quarter() {
	this.value = quarterValue;
	this.metallurgy = new CuproNickel();
	this.familiarName = "Quarter";
    }

    public Quarter(int year) {
	this.value = quarterValue;
	this.familiarName = "Quarter";
	this.metallurgy = new CuproNickel();
	this.manufactureYear = year;
    }

	protected Coin smelt(Coin c) {
        c.metallurgy.smelt(); 
        return c;
    }

    protected Coin edge(Coin c) {
        c.ridgedEdge = true;
        return c;
    }

    protected Coin imprintFrontImage(Coin c) {
        c.frontImage = "G_Washington";
        return c;
    }

    protected Coin imprintFrontMotto(Coin c) {
        c.frontMotto = "IN GOD WE TRUST";
        c.frontLabel = "LIBERTY";
        c.manufactureYear = 2025;
        return c;
    }

    protected Coin imprintBack(Coin c) {
        c.backImage = "Eagle";
		c.backMotto = "E PLURIBUS UNUM";
		c.backLabel = "UNITED STATES OF AMERICA";
		c.valueDescription = "QUARTER DOLLAR";
        return c;
    }
}
