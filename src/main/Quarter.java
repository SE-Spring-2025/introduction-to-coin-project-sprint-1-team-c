public class Quarter extends Coin {
    public Quarter() {
        familiarName = "Quarter";
        frontImage = "G_Washington";
        backImage = "Eagle";
        valueDescription = "QUARTER DOLLAR";
        ridgedEdge = true;
        metallurgy = "Cupro-Nickel";
        frontMotto = "IN GOD WE TRUST";
        backMotto = "E PLURIBUS UNUM";
        frontLabel = "LIBERTY";
        backLabel = "UNITED STATES OF AMERICA";
    }
    public Quarter(int year) {
        familiarName = "Quarter";
        frontImage = "G_Washington";
        backImage = "Eagle";
        valueDescription = "QUARTER DOLLAR";
        ridgedEdge = true;
        metallurgy = "Cupro-Nickel";
        frontMotto = "IN GOD WE TRUST";
        backMotto = "E PLURIBUS UNUM";
        frontLabel = "LIBERTY";
        backLabel = "UNITED STATES OF AMERICA";
        manufactureYear = year;
    }
}
