public class Dime extends Coin {
    public final double dimeValue = .1;
    
    public Dime() {
	this.value = dimeValue;
	this.metallurgy = new CuproNickel();
	this.familiarName = "Dime";
    
    }

    public Dime(int year) {
	this.value = dimeValue;
	this.familiarName = "Dime";
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
        c.frontImage = "F_Roosevelt";
        return c;
    }

    protected Coin imprintFrontMotto(Coin c) {
        c.frontMotto = "IN GOD WE TRUST";
        c.frontLabel = "LIBERTY";
        c.manufactureYear = manufactureYear;
        return c;
    }

    protected Coin imprintBack(Coin c) {
        c.backImage = "Torch_Branches";
        c.backMotto = "E PLURIBUS UNUM";
        c.backLabel = "UNITED STATES OF AMERICA";
        c.valueDescription = "ONE DIME";
        return c;
    }
}
