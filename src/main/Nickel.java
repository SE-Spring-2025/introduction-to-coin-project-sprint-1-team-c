public class Nickel extends Coin {
    public final double nickelValue = .05;

    public Nickel() {
	familiarName = "Nickel";
	frontImage = "T_Jefferson";
	backImage = "Jefferson_Memorial";
	valueDescription = "FIVE CENTS";
	ridgedEdge = false;
	metallurgy = new CuproNickel();
	frontMotto = "IN GOD WE TRUST";
	backMotto = "E PLURIBUS UNUM";
	frontLabel = "LIBERTY";
	backLabel = "UNITED STATES OF AMERICA";
	value = nickelValue;
    }

    public Nickel(int year) {
	familiarName = "Nickel";
	frontImage = "T_Jefferson";
	backImage = "Jefferson_Memorial";
	valueDescription = "FIVE CENTS";
	ridgedEdge = false;
	metallurgy = new CuproNickel();
	frontMotto = "IN GOD WE TRUST";
	backMotto = "E PLURIBUS UNUM";
	frontLabel = "LIBERTY";
	backLabel = "UNITED STATES OF AMERICA";
	manufactureYear = year;
	value = nickelValue;
    }
}
