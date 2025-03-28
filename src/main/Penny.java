public class Penny extends Coin {
    public Penny() {
	familiarName = "Penny";
	frontImage = "A_Lincoln";
	backImage = "Lincoln_Memorial";
	valueDescription = "ONE CENT";
	ridgedEdge = false;
	metallurgy = "Copper";
	frontMotto = "IN GOD WE TRUST";
	backMotto = "E PLURIBUS UNUM";
	frontLabel = "LIBERTY";
	backLabel = "UNITED STATES OF AMERICA";
    }

    public Penny(int year) {
	familiarName = "Penny";
	frontImage = "A_Lincoln";
	backImage = "Lincoln_Memorial";
	valueDescription = "ONE CENT";
	ridgedEdge = false;
	metallurgy = "Copper";
	frontMotto = "IN GOD WE TRUST";
	backMotto = "E PLURIBUS UNUM";
	frontLabel = "LIBERTY";
	backLabel = "UNITED STATES OF AMERICA";
	manufactureYear = year;
    }
}
