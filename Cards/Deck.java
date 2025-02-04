package Cards;
import java.util.*;
public class Deck {
    ArrayList<Card> deck;
    public Deck(){
        this.deck = new ArrayList<>();
    }
    public void createDeck(){
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7","8","9","10","J","Q","K"};
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        for (int i = 0; i < ranks.length; i++) {
            for (int j = 0; j < suits.length; j++) {
                Card new_card = new Card(ranks[i], suits[j]);
                deck.add(new_card);

            }
        }
    }
    public void DisplayDeck(){
        for (int i = 0; i < deck.size(); i++) {
            System.out.println(deck.get(i).toString());
        }

    }
}
