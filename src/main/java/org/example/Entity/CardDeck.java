package org.example.Entity;

import java.util.*;

public class CardDeck {
    List<Card> cardDeck;
    CardDeck(){
        cardDeck = new ArrayList<>();
        initializeDeck();
        shuffleCard();
    }

    public void shuffleCard() {
        Collections.shuffle(cardDeck);
    }

    //Shuffle method without using shuffle
//    private void shuffleCard() {
//        Random random = new Random();
//        for (int i = cardDeck.size() - 1; i > 0; i--) {
//            int j = random.nextInt(i + 1);
//            Card temp = cardDeck.get(i);
//            cardDeck.set(i, cardDeck.get(j));
//            cardDeck.set(j, temp);
//        }
//    }

    private void initializeDeck() {
        for(Suite suite : Suite.values()){
            for(CardRank cardRank: CardRank.values()){
                Card card = new Card(cardRank,suite);
                cardDeck.add(card);
            }
        }
    }

    public Card drawCard() {
        if(cardDeck.isEmpty()){
            throw new RuntimeException("The deck is empty");
        }
        return cardDeck.remove(cardDeck.size()-1);
    }

//    public Card sort(Card card1, Card card2){
//        Map<String,Integer> map = new HashMap<>();
//
//
//        map.put("JACK",13);
//
//        map.put("KING",12);
//
//        map.put("QUEEN",11);
//
//        map.put("ACE",1);
//        map.put("TWO",2);
//        map.put("THREE",2);
//        map.put("FOUR",2);
//        map.put("FIVE",2);
//        map.put("SIX",2);
//        map.put("SEVEN",2);
//        map.put("EIGHT",2);
//        map.put("NINE",2);
//
//        String valOfCardOne = card1.cardRank.name();
//        String valOfCardTwo = card2.cardRank.name();
//        int val1 = map.get(valOfCardOne);
//        int val2 = map.get(valOfCardTwo);
//
//
//        return val1>val2?card1:card2;
//    }

    public int compareCards(Card card1, Card card2) {
        return card1.getCardRank().ordinal() - card2.getCardRank().ordinal();
    }

//    public void sortDeck() {
//        cardDeck.sort(new Comparator<Card>() {
//            @Override
//            public int compare(Card o1, Card o2) {
//                int suiteComparison = o1.getSuite().ordinal() - o2.getSuite().ordinal();
//                if(suiteComparison!=0){
//                    return suiteComparison;
//                }else{
//                    return o1.getCardRank().ordinal()-o2.getCardRank().ordinal();
//                }
//            }
//        });
//    }

    //with lambda function
    public void sortDeck() {
        cardDeck.sort((card1,card2)->{
            if(card1.getSuite().ordinal()>card2.getSuite().ordinal()){
                return 1;
            } else if (card1.getSuite().ordinal()==card2.getSuite().ordinal()) {
                return card1.getCardRank().ordinal()-card2.getCardRank().ordinal();
            }else{
                return -1;
            }
        });
    }

}
