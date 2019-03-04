import java.util.Random;

public class Main {

    public static void main(String[] args) {

        System.out.println("Welcome to Blackjack");
        Deck deck = new Deck();

        System.out.println(deck.);

    }
}

class Deck {
    Card[] cards;
    Deck() {
        int numberOfCards = 20;
        cards = new Card[numberOfCards];
        for (int i = 0; i < cards.length ; i++) {
            Card card = new Card();
            card.suit = CardGenerator.provideSuit();
            card.value = CardGenerator.provideValue();
            cards[i] = card;
        }
    }
}

class Card {
    String suit;
    String value;
}

class CardGenerator {
    static Random random =new Random();
    static String[] suits = {"Spades", "Diamonds", "Clubs", "Hearts"};
    static String[] value = {"Ace", "King", "Queen", "Jack", "10" , "9", "8", "7", "6", "5", "4", "3", "2"}

    static String provideSuit() {
        int outcome = random.nextInt(suits.length);
        return suits[outcome];
    }

    static String provideValue() {
        int outcome = random.nextInt(value.length);
        return value[outcome];
    }
}

//player
//dealer
//plaatjes 10
//aas 1 of 11
//cards 2-10 face value
//4 - 8 decks of cards misschien eerst 1
// place a wager
// accept bets
// two cards face up player
// dealer 1 kaart gesloten 1 kaart open

//  hit (draw another card)
//  stand (do not take additional cards)
//  double (double your wager and stand)
//  split (split pairs)
//  or take insurance (if you feel the dealer has Blackjack).
//once bets are finalized
// dealer reveals cards
// if hand value beats dealer i win
// if dealers busts i win

