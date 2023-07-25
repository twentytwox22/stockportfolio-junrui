import java.util.HashMap;
import java.util.Map;

public class StockPortfolio {
    static HashMap<Stock, Integer> portfolio = new HashMap<>();

    public static void viewPortfolio() {
        System.out.println("Portfolio Value:" + totalValue() +"\n");
        for (Stock stock : portfolio.keySet()) {
            System.out.println("stock name: " + stock.getName() + " ["+ stock.getTicker() +"]" + "\n" + "stocks owned: " + portfolio.get(stock)
                    + "\n" + "stock value: " + stock.getPrice() * portfolio.get(stock) +"\n");
        }
    }
    public static double totalValue() {
        double value = 0;
        for (Stock stock : portfolio.keySet()) {
           value +=  stock.getPrice() * portfolio.get(stock);
        }
        return value;
    }

    public void put(Stock stock, int i) {
        portfolio.put(stock, i);
    }
}
