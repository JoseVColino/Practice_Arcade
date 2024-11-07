import java.util.ArrayList;
public class Terminal {
    private ArrayList<Prize> prizes = new ArrayList<>();

    public void addCredits(Card card, int creditToAdd) {
        System.out.println("How much money to credit in card "+ card.getCardID() + ": " + creditToAdd);
        
        int conversionRate = 2;
        card.setCreditBalance(card.getCreditBalance() + conversionRate*creditToAdd);
        showCardDetails(card);
    }

    public void transferCredit(Card giver, Card reciever, int transferAmount) {
        showCardDetails(giver);
        showCardDetails(reciever);

        giver.setCreditBalance(giver.getCreditBalance() - transferAmount);
        reciever.setCreditBalance(reciever.getCreditBalance() + transferAmount);
        showCardDetails(giver);
        showCardDetails(reciever);

    }

    public void transferTickets(Card giver, Card reciever, int transferAmount) {
        showCardDetails(giver);
        showCardDetails(reciever);

        giver.setTicketBalance(giver.getTicketBalance() - transferAmount);
        reciever.setTicketBalance(reciever.getTicketBalance() + transferAmount);
        showCardDetails(giver);
        showCardDetails(reciever);

    }
    
    public void showCardDetails(Card card) {
        System.out.println("^^^^^^^^^^^^^^^^");
        System.out.println("Card ID: " + card.getCardID());
        System.out.println("Card Credits: " + card.getCreditBalance());
        System.out.println("Card Tickets: " + card.getTicketBalance());
        System.out.println("vvvvvvvvvvvvvvvv");
    }

    public void tradeCreditForPrize(Card card, int prizeIndex) {
        int counter = 0;

        for (Prize prize : prizes) {
            System.out.println(counter + " - " + prize.getName() + ": " + prize.getPrizeCount() + " " + prize.getTicketCost());
            counter++;
        }
        Prize prize = prizes.get(prizeIndex);
        int prizeCost = prizes.get(prizeIndex).getTicketCost();
        int cardBalance = card.getTicketBalance();

        if (cardBalance - prizeCost < 0) {
            System.out.println("You cant afford this item.");
            return;
        }

        System.out.println("\nYou Bought a " + prize.getName() + " Enjoy!");
        card.setTicketBalance(cardBalance - prizeCost);
        prize.setPrizeCount(prize.getPrizeCount() - 1);
        showCardDetails(card);
    }

    public ArrayList<Prize> getPrizes() {
        return prizes;
    }

    public void setPrizes(ArrayList<Prize> prizes) {
        this.prizes = prizes;
    }

    

}
