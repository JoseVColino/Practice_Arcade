public class Prize {
    private String name;
    private int ticketCost;
    private int prizeCount;
    
    public Prize(String name, int ticketCost, int prizeCount) {
        this.name = name;
        this.ticketCost = ticketCost;
        this.prizeCount = prizeCount;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getTicketCost() {
        return ticketCost;
    }
    public void setTicketCost(int ticketCost) {
        this.ticketCost = ticketCost;
    }
    public int getPrizeCount() {
        return prizeCount;
    }
    public void setPrizeCount(int itemCount) {
        this.prizeCount = itemCount;
    }

    

}
