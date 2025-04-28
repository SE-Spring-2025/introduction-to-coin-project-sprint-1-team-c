public class Nickel extends Coin {
    public final double nickelValue = .05;

    public Nickel() {
	this.value = nickelValue;
	this.metallurgy = new CuproNickel();
	this.familiarName = "Nickel";
    }

    public Nickel(int year) {
	this.value = nickelValue;
	this.familiarName = "Nickel";
	this.metallurgy = new CuproNickel();
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
        c.frontImage = "T_Jefferson";
        return c;
    }

    protected Coin imprintFrontMotto(Coin c) {
        c.frontMotto = "IN GOD WE TRUST";
        c.frontLabel = "LIBERTY";
        c.manufactureYear = manufactureYear;
        return c;
    }

    protected Coin imprintBack(Coin c) {
        c.backImage = "Jefferson_Memorial";
        c.backMotto = "E PLURIBUS UNUM";
        c.backLabel = "UNITED STATES OF AMERICA";
        c.valueDescription = "FIVE CENTS";
        return c;
    }
}
