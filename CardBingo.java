//Raja Hammad Mehmood.
// This would play a modified version of Bingo. Each player gets a set of cards.
//Then a dealer deals the cards. If that card is equal to a card that a player has, he/she scores a point.
// If any one reaches 5 points he/she wins.

public class CardBingo {

    public static void main ( String[] args ) {

        // create and shuffle a deck of cards

        Deck deck = new Deck(); // deck is a deck of cards
        deck.shuffle();

        // dealing the cards

        Hand p1, p2;
        p1 = new Hand(); // hand for player 1
        p2 = new Hand(); // hand for player 2
        for ( int count = 0 ; count < 10 ; count++ ) {
            Card card = deck.dealCard(); // card is a card being dealt.
            p1.addCard(card);
        }
        for ( int count = 0 ; count < 10 ; count++ ) {
            Card card = deck.dealCard();
            p2.addCard(card);
        }
        Deck deck2=new Deck(); // deck2 is another set of cards
        deck2.shuffle();// deck2 is being shuffled
        int sum1=0;// sum of player 1 points
        int sum2=0;// sum of player 2 points
        while (sum1!=5 && sum2!=5 ) {
            Card card=deck2.dealCard();
            System.out.println("The dealer deals the "+ card.getValueAsString() + " of " +  card.getSuitAsString()  );
            if ((findCard(p1, card))!=-1){
                    sum1++;
                    System.out.println("Player 1 scores the point");
            }  
             if ((findCard(p2, card))!=-1){
                    sum2++;
                    System.out.println("Player 2 scores the point");
            }      
            
            


        }
        // checking who won the game.
        if (sum1==5) {
            System.out.println("player 1 wins!");
        } else {
            System.out.println("player 2 wins!");
        }

    }
    /*returns the position of an equivalent card in the hand if there is one or -1 if the hand does not contain an equivalent card
     *@param1 is the hand
     *@param2 is the card with which we have to match
     *@return is the position of that card in the hand
     **/
    public static int findCard(Hand hand, Card card){
        int position=-1;
        for(int count=0; count<hand.getCardCount(); count++) {
                if (card.getSuitAsString().equals((hand.getCard(count)).getSuitAsString()) && card.getValueAsString()==((hand.getCard(count)).getValueAsString()) ) {
                    position=count;
                    return count;
                }
            }
            return position;
    }
}