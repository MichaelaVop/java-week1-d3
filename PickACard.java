import java.lang.Math;

public class PickACard {
    
    public static void main(String[] args) {

        /* generate a random number and suit
        set an output / result
        set switch for different results
        */

        int cardNumber = (int)(Math.random() * 13) + 1;
        int cardSuit = (int)(Math.random() * 4) + 1;

        // System.out.println("Number " + cardNumber);
        // System.out.println("Suit " + cardSuit);

        String resultSuit = "";
        switch (cardSuit) {
            case 1: resultSuit = "Clubs";
            break;
            case 2: resultSuit = "Diamonds";
            break;
            case 3: resultSuit = "Hearts";
            break;
            case 4: resultSuit = "Spades";
            break;
        }

        // System.out.println(resultSuit);

        if (cardNumber > 1 && cardNumber < 11) {
            System.out.println("The card you picked is " + cardNumber + " of " + resultSuit + ".");          
        } else {
            switch (cardSuit) {
                case 1: System.out.println("The card you picked is Ace of " + resultSuit + ".");
                break;
                case 11: System.out.println("The card you picked is Jack of " + resultSuit + ".");
                break;
                case 12: System.out.println("The card you picked is Queen of " + resultSuit + ".");
                break;
                case 13: System.out.println("The card you picked is King of " + resultSuit + ".");
                break;
            }
        }



    }
}



