public class Dime extends Coin {
    public Dime() {
	familiarName = "Dime";
	frontImage = "F_Roosevelt";
	backImage = "Torch_Branches";
	valueDescription = "ONE DIME";
	ridgedEdge = true;
	metallurgy = "Cupro-Nickel";
	frontMotto = "IN GOD WE TRUST";
	backMotto = "E PLURIBUS UNUM";
	frontLabel = "LIBERTY";
	backLabel = "UNITED STATES OF AMERICA";
    }

    public Dime(int year) {
	familiarName = "Dime";
	frontImage = "F_Roosevelt";
	backImage = "Torch_Branches";
	valueDescription = "ONE DIME";
	ridgedEdge = true;	
	metallurgy = "Cupro-Nickel";
	frontMotto = "IN GOD WE TRUST";
	backMotto = "E PLURIBUS UNUM";
	frontLabel = "LIBERTY";
	backLabel = "UNITED STATES OF AMERICA";
	manufactureYear = year;
    }
}
