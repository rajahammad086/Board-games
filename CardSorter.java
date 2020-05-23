//Raja Hammad Mehmood.
// In this program we're creating a deck of cards, shuffling it, organizing cards in their respective positions
// and printing each pile out.
public class CardSorter {

    public static void main ( String[] args ) {

        // create and shuffle a deck of cards

        Deck deck = new Deck(); // deck is a deck of cards
        deck.shuffle();

        // dealing the cards

        Hand p1, p2,p3,p4;
        p1 = new Hand(); // hand for holding hearts
        p2 = new Hand(); // hand for holding spades 
        p3 = new Hand(); // hand for holding diamond    
        p4 = new Hand(); // hand for holding  clubs

        // repeat until out of cards and assigning a card to a particular pile.

        while (deck.cardsLeft()!=0  ) {
            Card card= deck.dealCard();
        if ( card.getSuit() == Card.HEARTS ) {
           p1.addCard(card);
        }
        else if ( card.getSuit() == Card.SPADES ) {
           p2.addCard(card);
        }
        else if ( card.getSuit() == Card.DIAMONDS ) {
           p3.addCard(card);
        }
        else if ( card.getSuit() == Card.CLUBS ) {
           p4.addCard(card);
        } 
            
     }
     // printing out cards of specific types
     for(int count=0; count<p1.getCardCount();count++){
        System.out.println( " Cards of Hearts "+ (p1.getCard(count)).getValue());
     }
     for(int count=0; count<p2.getCardCount();count++){
        System.out.println( "Cards of Spades "+ (p2.getCard(count)).getValue());
     }
     for(int count=0;count< p3.getCardCount();count++){
        System.out.println( " Cards of Diamonds"+ (p3.getCard(count)).getValue());
     }
     for(int count=0; count<p4.getCardCount();count++){
        System.out.println(" Cards of Clubs"+ (p4.getCard(count)).getValue());
     }

       

        


    }
}