package Cards;
import java.util.*;

class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();
        System.out.println("*********Creating Deck*********");
        deck.createDeck();
        System.out.println("*********Printing Deck*********");
        deck.DisplayDeck();
        System.out.println("**********Shuffling Deck***********");
        deck.shuffleDeck();
        deck.DisplayDeck();
        deck.Randomdraw2cards();
        player p1 = new player("Arav",5);
        player p2 = new player("Rio",5);
        deck.Distribute_unique_cards(p1);
        deck.Distribute_unique_cards(p2);
        System.out.println("*********cards are*******");
        for(int i = 0;i< 2;i++){
            System.out.println();

        }

    }
}
