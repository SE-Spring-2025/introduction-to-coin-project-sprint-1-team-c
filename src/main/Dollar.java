public class Dollar extends Coin {
    public final double dollarValue = 1;

    public Dollar() {
	this.value = dollarValue;
	this.metallurgy = new CuproNickel();
	this.familiarName = "Dollar";
    }

    public Dollar(int year) {
	this.value = dollarValue;
	this.familiarName = "Dollar";
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
        c.frontImage = "S_Anthony";
        return c;
    }

    protected Coin imprintFrontMotto(Coin c) {
        c.frontMotto = "IN GOD WE TRUST";
        c.frontLabel = "LIBERTY";
        c.manufactureYear = 2025;
        return c;
    }

    protected Coin imprintBack(Coin c) {
        c.backImage = "Moon_Eagle";
		c.backMotto = "E PLURIBUS UNUM";
		c.backLabel = "UNITED STATES OF AMERICA";
		c.valueDescription = "DOLLAR";
        return c;
    }
}
