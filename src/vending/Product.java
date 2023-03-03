package vending;

public enum Product {
    Kitkat(1, 50),
    Chips(2, 50),
    WATER(3, 30),
    cake(4, 150),
    EMPTY(0, 0);

    private int selectionNumber;
    private int price;

    private Product(int selectionNumber, int price) {
        this.selectionNumber = selectionNumber;
        this.price = price;
    }

    public int getSelectionNumber() {
        return this.selectionNumber;
    }

    public int getPrice() {
        return this.price;
    }

    public static Product valueOf(int numberSelection) {
        Product[] var1 = values();
        int var2 = var1.length;

        for(int var3 = 0; var3 < var2; ++var3) {
            Product product = var1[var3];
            if (numberSelection == product.getSelectionNumber()) {
                return product;
            }
        }

        return EMPTY;
    }
}
