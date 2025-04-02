public class Dollar extends Coin { 
    public final double dollarValue = 1;
    public Dollar() {
        familiarName = "Dollar";
        frontImage = "S_Anthony";
        backImage = "Moon_Eagle";
        valueDescription = "ONE DOLLAR";
        ridgedEdge = true;
        metallurgy = new CuproNickel();
        frontMotto = "IN GOD WE TRUST";
        backMotto = "E PLURIBUS UNUM";
        frontLabel = "LIBERTY";
        backLabel = "UNITED STATES OF AMERICA";
        value = dollarValue;
    }
    public Dollar(int year) {
        familiarName = "Dollar";
        frontImage = "S_Anthony";
        backImage = "Moon_Eagle";
        valueDescription = "ONE DOLLAR";
        ridgedEdge = true;
        metallurgy = new CuproNickel();
        frontMotto = "IN GOD WE TRUST";
        backMotto = "E PLURIBUS UNUM";
        frontLabel = "LIBERTY";
        backLabel = "UNITED STATES OF AMERICA";
        manufactureYear = year;
        value = dollarValue;
    }
    
    
}
