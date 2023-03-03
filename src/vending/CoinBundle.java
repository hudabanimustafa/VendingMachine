package vending;

public class CoinBundle {
    public int number5DollarCoins;
    public int number10DollarCoins;
    public int number20DollarCoins;
    public int number50DollarCoins;
    public int number100DollarCoins;

    public CoinBundle(int... enteredCoins) {
        this.number5DollarCoins = enteredCoins[0];
        this.number10DollarCoins = enteredCoins[1];
        this.number20DollarCoins = enteredCoins[2];
        this.number50DollarCoins = enteredCoins[3];
        this.number100DollarCoins = enteredCoins[4];
    }

    public int getTotal() {
        int total = 0;
        total += this.number5DollarCoins * Coin.FIVE_Dollar.getValue();
        total += this.number10DollarCoins * Coin.TEN_Dollar.getValue();
        total += this.number20DollarCoins * Coin.TWENTY_Dollar.getValue();
        total += this.number50DollarCoins * Coin.FIFTY_Dollar.getValue();
        total += this.number100DollarCoins * Coin.HUNDRED_Dollar.getValue();
        return total;
    }
}
