package org.example.Entity;

public class Card {
    CardRank cardRank;
    Suite suite;

    public Card(CardRank cardRank, Suite suite) {
        this.cardRank = cardRank;
        this.suite = suite;
    }

    @Override
    public String toString() {
        return "Card{" +
                "cardRank=" + cardRank +
                ", suite=" + suite +
                '}';
    }

    public CardRank getCardRank() {
        return cardRank;
    }

    public void setCardRank(CardRank cardRank) {
        this.cardRank = cardRank;
    }

    public Suite getSuite() {
        return suite;
    }

    public void setSuite(Suite suite) {
        this.suite = suite;
    }
}
