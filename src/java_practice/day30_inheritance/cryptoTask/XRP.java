package java_practice.day30_inheritance.cryptoTask;

public class XRP extends CryptoToken{

    public XRP(double price, int quantity, long marketCap, long circulatingSupply, boolean isMineable) {
        super(price, quantity, marketCap, circulatingSupply, isMineable);
    }
}
