package vending;

public class SimpleCalculator implements Calculator {
    public SimpleCalculator() {
    }

    public int calculateTotal(CoinBundle enteredCoins) {
        return enteredCoins.getTotal();
    }

    public CoinBundle calculateChange(int amountMoneyToReturn) {
        CoinBundle change = new CoinBundle(new int[5]);
        change.number100DollarCoins = amountMoneyToReturn / Coin.HUNDRED_Dollar.getValue();
        int remainingAmount = amountMoneyToReturn % Coin.HUNDRED_Dollar.getValue();
        change.number50DollarCoins = remainingAmount / Coin.FIFTY_Dollar.getValue();
        remainingAmount %= Coin.FIFTY_Dollar.getValue();
        change.number20DollarCoins = remainingAmount / Coin.TWENTY_Dollar.getValue();
        remainingAmount %= Coin.TWENTY_Dollar.getValue();
        change.number10DollarCoins = remainingAmount / Coin.TEN_Dollar.getValue();
        remainingAmount %= Coin.TEN_Dollar.getValue();
        change.number5DollarCoins = remainingAmount / Coin.FIVE_Dollar.getValue();
        return change;
    }
}
