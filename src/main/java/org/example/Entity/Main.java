package org.example.Entity;

public class Main {
    public static void main(String[] args) {
        CardDeck cardDeck = new CardDeck();

        System.out.println("carddeck size"+cardDeck.cardDeck.size());

//        for(int i = 0; i < 5; i++){
//            Card card = cardDeck.drawCard();
//            System.out.println("drawn card"+card);
//        }


        Card card1 = cardDeck.drawCard();
        Card card2 = cardDeck.drawCard();
        System.out.println("before sort " +card1+" "+card2);

        int comparisonResult = cardDeck.compareCards(card1, card2);

        if (comparisonResult > 0) {
            System.out.println("Card 1 has a higher rank.");
        } else if (comparisonResult < 0) {
            System.out.println("Card 2 has a higher rank.");
        } else {
            System.out.println("Both cards have the same rank.");
        }

        cardDeck = new CardDeck();
        cardDeck.shuffleCard();
        System.out.println("Deck shuffled.");
        cardDeck.sortDeck();

        System.out.println("ALL card after sorting");
        for (Card card: cardDeck.cardDeck){
            System.out.println(card);
        }
        System.out.println("Deck sorted by rank and suite.");

        // Draw another card after sorting
//        Card sortedCard = cardDeck.drawCard();
//        System.out.println("Drawn card after sorting: " + sortedCard);


//        System.out.println("after drawning 4 cards"+cardDeck.cardDeck.size());
    }
}
