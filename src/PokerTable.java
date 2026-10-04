import java.util.Scanner;

public class PokerTable {
    private Poker poker = new Poker();
    private Player[] players;
    public PokerTable() { this.poker = new Poker(); }

    public void StartGame() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество игроков: ");
        int n = scanner.nextInt();
        players = new Player[n];
        for (int i=0; i < players.length; i++) players[i] = new Player();

        for (int i=0; i < players.length; i++)
            players[i].setPlayerDeck(poker.grantCards(5));

        for (int i=0; i < players.length; i++) {
            System.out.printf("Player %d: ", i+1);
            poker.printDeck(players[i].getPlayerDeck());
            System.out.println();
        }
        System.out.print("Cards remaining in deck: ");
        poker.printDeck();
    }

    private class Player {
        private Poker.Card[] playerDeck;
        private void setPlayerDeck(Poker.Card[] deck) { playerDeck = deck; }
        public Poker.Card[] getPlayerDeck() { return playerDeck; }
    }
}
