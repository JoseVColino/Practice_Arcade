import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        Card cardDani = new Card();
        Card cardJose = new Card();
        Game basketball = new Game( 2);
        Game roulette = new Game( 5);
        Prize pkmnPlushie = new Prize("Pokemon Plushie", 20, 3);
        Prize bubbleGum = new Prize("Bubblegum ", 5, 10);
        Terminal terminal = new Terminal();
        ArrayList<Prize> prizes = new ArrayList<>();

        // Future Make a dynamic choice cycle in menu form (java pannels are cooler though)

        prizes.add(pkmnPlushie);
        prizes.add(bubbleGum);
        terminal.setPrizes(prizes);
        terminal.showCardDetails(cardDani);
        terminal.showCardDetails(cardJose);

        terminal.addCredits(cardDani, 20);
        terminal.addCredits(cardJose, 10);

        basketball.swipeCard(cardDani);
        basketball.swipeCard(cardJose);
        roulette.swipeCard(cardDani);
        roulette.swipeCard(cardJose);
        
        terminal.showCardDetails(cardDani);
        terminal.showCardDetails(cardJose);
        terminal.transferTickets(cardJose, cardDani, cardJose.getTicketBalance());
        terminal.tradeCreditForPrize(cardDani, 0);
        terminal.tradeCreditForPrize(cardDani, 0);
        terminal.tradeCreditForPrize(cardDani, 0);
        terminal.tradeCreditForPrize(cardDani, 1);
    }
}
