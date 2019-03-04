import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        System.out.println("Welcome to Blackjack");

    }
}

class deckOfCards {

    cardSuite spades = new cardSuite();
    cardSuite hearts = new cardSuite();
    cardSuite diamonds = new cardSuite();
    cardSuite clubs = new cardSuite();

    int[] deckOfCardsValues = {spades, hearts, diamonds, clubs};


}

class cardSuite {
    ArrayList<Integer>
    int[] numberedCards = {2, 3, 4, 5, 6, 7, 8, 9};
    int[] ace = {11}; //moet ook 1 kunnen zijn later
    int[] royals = {10, 10, 10,};



}

class player {

}

class dealer {

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

