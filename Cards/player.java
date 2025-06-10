package Cards;

public class player {
    String name;
    int no_of_cards;
    public player(String name,int no_of_cards){
        this.name = name;
        this.no_of_cards = no_of_cards;
    }
    public String toString(){
        return "Player: "+name+" Number: "+no_of_cards;
    }
    public void DisplayCards1(player p){
        for (int i = 0; i < p.no_of_cards; i++) {
            System.out.println("Card: "+i);
            
        }
    }

}
