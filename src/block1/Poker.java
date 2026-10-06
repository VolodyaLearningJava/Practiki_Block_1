package block1;

import java.util.*;
public class Poker {
    private Card[] deck;
    public Card[] getDeck() { return this.deck; }

    public Poker() {
        this.deck = new Card[54];

        for (int i=0; i<4; i++){
            CardSuit curSuit;
            switch (i){
                case 0:
                    curSuit = CardSuit.Spades;
                    break;
                case 1:
                    curSuit = CardSuit.Clubs;
                    break;
                case 2:
                    curSuit = CardSuit.Hearts;
                    break;
                default:
                    curSuit = CardSuit.Diamonds;
                    break;
            }
            for (int j=0; j<13;j++){
                this.deck[13*i + j] = new Card(j, curSuit);
            }
        }
        this.deck[52] = new Card(0, CardSuit.Joker);
        this.deck[53] = new Card(1, CardSuit.Joker);
        shuffleDeck();
    }
    private void shuffleDeck() {
        Random rnd = new Random();
        for (int i = deck.length - 1; i > 0; i--)
        {
            int index = rnd.nextInt(i + 1);
            Card a = deck[index];
            deck[index] = deck[i];
            deck[i] = a;
        }
    }

    public Card[] grantCards(int n) {
        if (n > deck.length) {
            System.out.println("Deck size violation!");
            return null;
        }

        Card[] cards = new Card[n];
        Card[] newDeck = new Card[deck.length-n];
        for (int i=0; i < deck.length; i++){
            if (i<n) {
                cards[i] = deck[i];
            }
            else {
                newDeck[i-n] = deck[i];
            }
        }
        this.deck = newDeck;
        return cards;
    }

    public String cardToString(Card card) {
        switch (card.suit){
            case CardSuit.Joker:
                return (card.id==0 ? "Black Joker" : "Red Joker");
            default:
                String str = "";
                switch (card.id){
                    case 12:
                        str="Ace";
                        break;
                    case 11:
                        str="King";
                        break;
                    case 10:
                        str="Queen";
                        break;
                    case 9:
                        str="Jack";
                        break;
                    default:
                        str = Integer.toString(card.id+2);
                        break;
                }
                return str+" of "+card.suit.name();
        }
    }
    public void printDeck(){
        System.out.print(cardToString(deck[0]));
        for (int i=1; i < deck.length; i++){
            System.out.print("|" + cardToString(deck[i]));
        }
        System.out.println();
    }
    public void printDeck(Card[] cards){
        System.out.print(cardToString(cards[0]));
        for (int i=1; i < cards.length; i++){
            System.out.print("|" + cardToString(cards[i]));
        }
        System.out.println();
    }

    public enum CardSuit { Spades, Clubs, Hearts, Diamonds, Joker }
    public class Card {
        int id;
        CardSuit suit;

        public Card(int id, CardSuit suit) {
            this.id = id;
            this.suit = suit;
        }
        public Card() {
            this.id = 0;
            this.suit = CardSuit.Spades;
        }
    }
}
