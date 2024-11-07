import java.util.Random;


public class Game {
    private int creditCost;

    public Game(int creditCost) {
        this.creditCost = creditCost;
    }

    public void swipeCard(Card card) {
        int credit = card.getCreditBalance();

        if (credit - creditCost < 0) {
            System.out.println("You Dont Have Enough Tickets to Play");
            return;
        }

        // paying in credits to play the game
        card.setCreditBalance(credit - creditCost);
        Random random = new Random();

        // winning the tickets
        int ticketsWon = random.nextInt(11);
        card.setTicketBalance(
            card.getCreditBalance() + ticketsWon
        );
        System.out.println("Congratulations, you have won " + ticketsWon + " tickets!");

    }

    public int getCreditCost() {
        return creditCost;
    }

    public void setCreditCost(int creditCost) {
        this.creditCost = creditCost;
    }

    
}
