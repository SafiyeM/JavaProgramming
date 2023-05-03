package java_practice.day30_inheritance.cryptoTask;

public class CryptoToken {



    private double price;
    private int quantity;
    private long marketCap;
    private long circulatingSupply;
    private boolean isMineable;

    public CryptoToken(double price, int quantity, long marketCap, long circulatingSupply, boolean isMineable) {
        setPrice(price);
        setQuantity(quantity);
        setMarketCap(marketCap);
        setCirculatingSupply(circulatingSupply);
        setMineable(isMineable);
    }


    public double getPrice() {
        return price;
    }

    // price can not be set to zero or negative
    public void setPrice(double price) {

        if (price <= 0){
            System.err.println("Invalid price");
            System.exit(1);
        }
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    //quantity can not set to negative
    public void setQuantity(int quantity) {
        if (quantity < 0){
            System.err.println("Invalid quantity");
            System.exit(1);
        }

        this.quantity = quantity;
    }

    public long getMarketCap() {
        return marketCap;
    }

    public void setMarketCap(long marketCap) {

        if (marketCap == 0){
            System.err.println("Invalid market cap");
            System.exit(1);
        }
        this.marketCap = marketCap;
    }

    public long getCirculatingSupply() {
        return circulatingSupply;
    }

    public void setCirculatingSupply(long circulatingSupply) {
        this.circulatingSupply = circulatingSupply;
    }

    public boolean isMineable() {
        return isMineable;
    }

    public void setMineable(boolean mineable) {
        isMineable = mineable;
    }

    public double totalPrice(){
        return price * quantity;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +": " +
                "price=" + price +
                ", quantity=" + quantity +
                ", marketCap=" + marketCap +
                ", circulatingSupply=" + circulatingSupply +
                ", isMineable=" + isMineable +
                '}';
    }
}
/*
	1. create a class called CryptoToken
			variables:
				price, quantity, marketCap, volume, circulatingSupply, isMineable (boolean)

			Encapsulate all the fields
				Conditions:
					1. price can not be set to zero or negative
					2. quantity can not set to negative
					3. marketCap can not be zero

			methods:
				toString()
				totalPrice(): returns the total price of the crypto token ( price * quantity)
 */