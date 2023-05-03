package java_practice.day30_inheritance.cryptoTask;

public class MyWallet {


    public static void main(String[] args) {


        double totalAsset= 0.0;

        Bitcoin bitcoin = new Bitcoin(40000,21_000_000,840_000_000_000L,18_700_000,true);
        Cardano cardano = new Cardano(1.57,45_000_000,75_000_000_000L,31_112_484_646L, false);
        Doge doge = new Doge(0.33, 130_000_000, 42_000_000_000L, 130_000_000_000L, true);
        Ethereum ethereum = new Ethereum(3_200.0, 117_800_000, 378_000_000_000L, 117_800_000, false);
        XRP xrp = new XRP(1.43, 100_000_000, 68_000_000_000L, 47_355_904_740L, false);



        // Calculate the total asset value by adding up the market value of each cryptocurrency

        totalAsset += bitcoin.getMarketCap();
        totalAsset += cardano.getMarketCap();
        totalAsset += doge.getMarketCap();
        totalAsset += ethereum.getMarketCap();
        totalAsset += xrp.getMarketCap();

        System.out.println("totalAsset = $" + totalAsset); // totalAsset = $1.403E12



    }

}
/*

        XPR:
        double price = 1.43;
        int quantity = 100_000_000_000;
        long marketCap = 68_000_000_000L;
        long circulatingSupply = 47_355_904_740L;
        boolean isMineable = false;

        Ethereum:
        double price = 3_200.0;
        int quantity = 117_800_000;
        long marketCap = 378_000_000_000L;
        long circulatingSupply = 117_800_000;
        boolean isMineable = false;

        Doge:
        double price = 0.33;
        int quantity = 130_000_000_000;
        long marketCap = 42_000_000_000L;
        long circulatingSupply = 130_000_000_000L;
        boolean isMineable = true;

        Cardano:
        double price = 1.57;
        int quantity = 45_000_000;
        long marketCap = 75_000_000_000L;
        long circulatingSupply = 31_112_484_646L;
        boolean isMineable = false;

         Bitcoin:
        double price = 40000.0;
        int quantity = 21_000_000;
        long marketCap = 840_000_000_000L;
        long circulatingSupply = 18_700_000;
        boolean isMineable = true;

	 3. create a class named MyWallet

		create one object of each CryptoToken

		calculate the total Asset
 */