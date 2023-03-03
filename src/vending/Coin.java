package vending;

public enum Coin {
    FIVE_Dollar(5),
    TEN_Dollar(10),
    TWENTY_Dollar(20),
    FIFTY_Dollar(50),
    HUNDRED_Dollar(100);

    private int value;

    private Coin(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    public static int[] parseCoins(String coins) {
        String[] numberCoinsInText = coins.split(",");
        int[] result = new int[numberCoinsInText.length];

        for(int index = 0; index < numberCoinsInText.length; ++index) {
            result[index] = Integer.parseInt(numberCoinsInText[index]);
        }

        return result;
    }
}