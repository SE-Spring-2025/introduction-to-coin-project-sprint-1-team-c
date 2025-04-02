public class Dime extends Coin {
    public final double dimeValue = .1;

    public Dime() {
	familiarName = "Dime";
	frontImage = "F_Roosevelt";
	backImage = "Torch_Branches";
	valueDescription = "ONE DIME";
	ridgedEdge = true;
	metallurgy = new CuproNickel();
	frontMotto = "IN GOD WE TRUST";
	backMotto = "E PLURIBUS UNUM";
	frontLabel = "LIBERTY";
	backLabel = "UNITED STATES OF AMERICA";
	value = dimeValue;
    }

    public Dime(int year) {
	familiarName = "Dime";
	frontImage = "F_Roosevelt";
	backImage = "Torch_Branches";
	valueDescription = "ONE DIME";
	ridgedEdge = true;	
	metallurgy = new CuproNickel();
	frontMotto = "IN GOD WE TRUST";
	backMotto = "E PLURIBUS UNUM";
	frontLabel = "LIBERTY";
	backLabel = "UNITED STATES OF AMERICA";
	manufactureYear = year;
	value = dimeValue;
    }
}
