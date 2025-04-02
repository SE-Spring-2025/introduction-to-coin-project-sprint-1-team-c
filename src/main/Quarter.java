public class Quarter extends Coin {
    public final double quarterValue = .25;
    public Quarter() {
        familiarName = "Quarter";
        frontImage = "G_Washington";
        backImage = "Eagle";
        valueDescription = "QUARTER DOLLAR";
        ridgedEdge = true;
        metallurgy = new CuproNickel();
        frontMotto = "IN GOD WE TRUST";
        backMotto = "E PLURIBUS UNUM";
        frontLabel = "LIBERTY";
        backLabel = "UNITED STATES OF AMERICA";
        value = quarterValue;
    }
    public Quarter(int year) {
        familiarName = "Quarter";
        frontImage = "G_Washington";
        backImage = "Eagle";
        valueDescription = "QUARTER DOLLAR";
        ridgedEdge = true;
        metallurgy = new CuproNickel();
        frontMotto = "IN GOD WE TRUST";
        backMotto = "E PLURIBUS UNUM";
        frontLabel = "LIBERTY";
        backLabel = "UNITED STATES OF AMERICA";
        manufactureYear = year;
        value = quarterValue;
    }
}
