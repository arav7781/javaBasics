package Cards;
import java.util.*;

public class Deck{
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
    public void shuffleDeck(){

        Collections.shuffle(deck);

    }
    public void Randomdraw2cards(){
        Random random = new Random();
        int index1 = random.nextInt(deck.size());
        int index2 = random.nextInt(deck.size());
        Card card1 = deck.get(index1);
        Card card2 = deck.get(index2);
        System.out.println("******displaying*********");
        System.out.println("card1: " + card1.toString());
        System.out.println("card2: " + card2.toString());
    
    }
    public void Distribute_unique_cards(player p){
        for (int i = 0; i < p.no_of_cards; i++) {
            for (int j = i + 1; j < deck.size(); j++) {
                if (deck.get(i).equals(deck.get(j))) {
                    deck.remove(j);
                    j--;
                }
            }
        }
    }
   
}
