import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DeckOfCards {
    private List<Card> deck;
    private static final String[] SUITS = {"Spades", "Hearts", "Clubs", "Diamonds"};
    private static final String[] RANKS = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
    public DeckOfCards() {
        initializeDeck();
    }
    private void initializeDeck() {
        deck = new ArrayList<>(52);
        for (String suit : SUITS) {
            for (String rank : RANKS) {
                deck.add(new Card(suit, rank));
            }
        }
    }
    public void shuffle() {
        Collections.shuffle(deck);
        System.out.println("Deck shuffled.");
    }

    public Card dealCard() {
        if (deck.isEmpty()) {
            System.out.println("The deck is empty!");
            return null;
        }
        return deck.remove(0);
    }
    public int cardsRemaining() {
        return deck.size();
    }
    public static class CardGameDemo {
        public static void main(String[] args) {
            DeckOfCards myDeck = new DeckOfCards();
            System.out.println("Cards in a new deck: " + myDeck.cardsRemaining());
            myDeck.shuffle();

            int cardsToDeal = 4;
            System.out.println("\n--- Dealing the first " + cardsToDeal + " cards ---");
            for (int i = 0; i < cardsToDeal; i++) {
                Card dealtCard = myDeck.dealCard();
                if (dealtCard != null) {
                    System.out.println("Card number " + (i + 1) + ": " + dealtCard);
                }
            }

            System.out.println("\nCards remaining in the deck: " + myDeck.cardsRemaining());
        }
    }
}