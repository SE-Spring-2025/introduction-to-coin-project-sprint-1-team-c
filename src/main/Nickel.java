public class Nickel extends Coin {
    public Nickel() {
	familiarName = "Nickel";
	frontImage = "T_Jefferson";
	backImage = "Jefferson_Memorial";
	valueDescription = "FIVE CENTS";
	ridgedEdge = false;
	metallurgy = "Cupro-Nickel";
	frontMotto = "IN GOD WE TRUST";
	backMotto = "E PLURIBUS UNUM";
	frontLabel = "LIBERTY";
	backLabel = "UNITED STATES OF AMERICA";
    }

    public Nickel(int year) {
	familiarName = "Nickel";
	frontImage = "T_Jefferson";
	backImage = "Jefferson_Memorial";
	valueDescription = "FIVE CENTS";
	ridgedEdge = false;
	metallurgy = "Cupro-Nickel";
	frontMotto = "IN GOD WE TRUST";
	backMotto = "E PLURIBUS UNUM";
	frontLabel = "LIBERTY";
	backLabel = "UNITED STATES OF AMERICA";
	manufactureYear = year;
    }
}
