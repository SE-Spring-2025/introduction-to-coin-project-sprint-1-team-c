public class HalfDollar extends Coin {
    public final double halfDollarValue = .5;

    public HalfDollar() {
	this.value = halfDollarValue;
	this.metallurgy = new CuproNickel();
	this.familiarName = "HalfDollar";
    }

    public HalfDollar(int year) {
	this.value = halfDollarValue;
	this.familiarName = "HalfDollar";
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
        c.frontImage = "J_Kennedy";
        return c;
    }

    protected Coin imprintFrontMotto(Coin c) {
        c.frontMotto = "IN GOD WE TRUST";
        c.frontLabel = "LIBERTY";
        c.manufactureYear = 2025;
        return c;
    }

    protected Coin imprintBack(Coin c) {
        c.backImage = "Presidential_Seal";
		c.backMotto = "E PLURIBUS UNUM";
		c.backLabel = "UNITED STATES OF AMERICA";
		c.valueDescription = "HALF DOLLAR";
        return c;
    }
}
