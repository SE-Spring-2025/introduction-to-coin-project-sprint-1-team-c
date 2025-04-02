public class HalfDollar extends Coin {
    public final double halfDollarValue = .5;
    public HalfDollar() {
        familiarName = "HalfDollar";
        frontImage = "J_Kennedy";
        backImage = "Presidential_Seal";
        valueDescription = "HALF DOLLAR";
        ridgedEdge = true;
        metallurgy = new CuproNickel();
        frontMotto = "IN GOD WE TRUST";
        backMotto = "E PLURIBUS UNUM";
        frontLabel = "LIBERTY";
        backLabel = "UNITED STATES OF AMERICA"; 
        value = halfDollarValue;   
    }
    public HalfDollar(int year) {
        familiarName = "HalfDollar";
        frontImage = "J_Kennedy";
        backImage = "Presidential_Seal";
        valueDescription = "HALF DOLLAR";
        ridgedEdge = true;
        metallurgy = new CuproNickel();
        frontMotto = "IN GOD WE TRUST";
        backMotto = "E PLURIBUS UNUM";
        frontLabel = "LIBERTY";
        backLabel = "UNITED STATES OF AMERICA";
        manufactureYear = year;
        value = halfDollarValue;   
    }
    
}
