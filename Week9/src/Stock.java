public class Stock {
    private String symbol;
    private String name;
    private double previousClosingPrice;
    private double currentPrice;

    // Constructor
    public Stock(String symbol, String name) {
        this.symbol = symbol;
        this.name = name;
    }

    // Getter methods (if needed)
    public String getSymbol() {
        return symbol;
    }

    public String getName() {
        return name;
    }

    public double getPreviousClosingPrice() {
        return previousClosingPrice;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    // Setter methods (if needed)
    public void setPreviousClosingPrice(double previousClosingPrice) {
        this.previousClosingPrice = previousClosingPrice;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    // Method to calculate the percentage change
    public double getChangePercent() {
        if (previousClosingPrice == 0) {
            return 0; // Avoid division by zero
        }
        return ((currentPrice - previousClosingPrice) / previousClosingPrice) * 100;
    }
}
