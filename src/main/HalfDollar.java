public class HalfDollar extends Coin {
    public HalfDollar() {
        familiarName = "HalfDollar";
        frontImage = "J_Kennedy";
        backImage = "Presidential_Seal";
        valueDescription = "HALF DOLLAR";
        ridgedEdge = true;
        metallurgy = "Cupro-Nickel";
        frontMotto = "IN GOD WE TRUST";
        backMotto = "E PLURIBUS UNUM";
        frontLabel = "LIBERTY";
        backLabel = "UNITED STATES OF AMERICA";    
    }
    public HalfDollar(int year) {
        familiarName = "HalfDollar";
        frontImage = "J_Kennedy";
        backImage = "Presidential_Seal";
        valueDescription = "HALF DOLLAR";
        ridgedEdge = true;
        metallurgy = "Cupro-Nickel";
        frontMotto = "IN GOD WE TRUST";
        backMotto = "E PLURIBUS UNUM";
        frontLabel = "LIBERTY";
        backLabel = "UNITED STATES OF AMERICA";
        manufactureYear = year;
    }
    
}
