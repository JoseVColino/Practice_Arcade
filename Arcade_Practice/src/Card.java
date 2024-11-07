public class Card {
    private int cardID;
    private int creditBalance;
    private int ticketBalance;
    private static int cardNumber = 0;
    
    public Card() {
        setCardID(cardNumber);
        cardNumber = cardNumber + 1;
    }
    public int getCardNumber() {
        return cardNumber;
    }
    public int getCreditBalance() {
        return creditBalance;
    }
    public void setCreditBalance(int creditBalance) {
        this.creditBalance = creditBalance;
    }
    public int getTicketBalance() {
        return ticketBalance;
    }
    public void setTicketBalance(int ticketBalance) {
        this.ticketBalance = ticketBalance;
    }
    public int getCardID() {
        return cardID;
    }
    public void setCardID(int cardID) {
        this.cardID = cardID;
    }

    
}
