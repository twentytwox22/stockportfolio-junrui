import java.util.HashMap;
public class StockPortfolio {

    //represents the collection of stocks and allows users to add
    // stocks to their portfolio and view the portfolio's holdings with
    // their respective quantities, prices, and total values.

    static HashMap<Stock, Integer> portfolio = new HashMap<Stock, Integer>();

    public static void viewPortfolio(){
        System.out.println("Portfolio Value:" + totalValue());
        for (Stock i : portfolio.keySet()) {
            System.out.println("stock name: " + i.getName() + "\n"+"stocks owned: " + portfolio.get(i));
        }
    }
    public static int totalValue() {
        int value = 0;
        // code that returns totalvalue
        return value;
    }

    public void put(Stock stock, int i) {
        portfolio.put(stock, i);
    }
}
