import java.util.HashMap;

public class Stock {
    public  String ticker;
    public  String name;
    public  double price;

    //constructors
    public Stock(String ticker, String name, double price) {
        this.ticker = ticker;
        this.name = name;
        this.price = price;
    }
    public Stock(String ticker, String name) {
        this.ticker = ticker;
        this.name = name;
    }

    //getters
    public String getTicker() {
        return ticker;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

}

