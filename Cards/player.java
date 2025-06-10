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
    public void DisplayCards1(int i2){
        for (int i = 0; i < i2.no_of_cards; i++) {
            System.out.println("Card: "+i);
            
        }
    }
    public boolean DisplayCards1(int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'DisplayCards1'");
    }

}
