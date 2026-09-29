import java.util.*;
public class Poker {
    private Card[] deck;

    public Poker() {
        this.deck = new Card[58];

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
        this.deck[56] = new Card(0, CardSuit.Joker);
        this.deck[57] = new Card(1, CardSuit.Joker);
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
