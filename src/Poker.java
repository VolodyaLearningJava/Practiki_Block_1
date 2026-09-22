public class Poker {
    private Card[] deck = new Card[58];

    /*public Poker() {

    }*/

    //public

    private void shuffleDeck() {

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
