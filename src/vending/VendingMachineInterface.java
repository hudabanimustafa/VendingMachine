package vending;

public interface VendingMachineInterface {
    void displayProducts();

    void selectProduct(int var1);

    void displayEnterCoinsMessage();

    void enterCoins(int... var1);

    void displayChangeMessage();

    public static class TextVendingMachineInterface implements VendingMachineInterface {
        private VendingMachineController controller = new SimpleVendingMachineController();
        private int selectedProduct;
        private CoinBundle change;

        public TextVendingMachineInterface() {
        }

        public void displayProducts() {
            System.out.println(">>>>press to enter to vending machine <<<<");
            System.out.println("     WELCOME TO THE VENDING MACHINE           ");
            System.out.println(" >>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<>>>>>>>>>>>>");
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
            System.out.println("            Products available:               ");
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
            System.out.println("                                              ");
            Product[] var1 = Product.values();
            int var2 = var1.length;

            for(int var3 = 0; var3 < var2; ++var3) {
                Product product = var1[var3];
                if (!Product.EMPTY.equals(product)) {
                    System.out.println("     " + product.getSelectionNumber() + "  " + product.name() + " - Price: " + product.getPrice() + "   ");
                }
            }

            System.out.println("                                              ");
            System.out.println(" Please select your product: ");
        }

        public void selectProduct(int product) {
            this.selectedProduct = product;
        }

        public void displayEnterCoinsMessage() {
            System.out.println(" Please enter coins as follows: ");
            System.out.println(" num of 5 Dollar coins,num of 10 Dollar coins,num of 20 Dollar coins,num of 50 Dollar coins,num of 100 Dollar coins  ");
            System.out.println("                                              ");
            System.out.println(" Example: If you would like to enter 2 ten Dollar coins: 0,2,0,0,0");
            System.out.println("Plese enter coins:");
        }

        public void enterCoins(int... coins) {
            VendingMachineRequest request = new VendingMachineRequest(this.selectedProduct, coins);
            this.change = this.controller.calculateChange(request);
        }

        public void displayChangeMessage() {
            System.out.println("                                              ");
            System.out.println("Your change is :" + this.change.getTotal() + "Dollar splitted as follows: ");
            System.out.println("    100 Dollar coins: " + this.change.number100DollarCoins);
            System.out.println("    50 Dollar coins: " + this.change.number50DollarCoins);
            System.out.println("    20 Dollar coins: " + this.change.number20DollarCoins);
            System.out.println("    10 Dollar coins: " + this.change.number10DollarCoins);
            System.out.println("    5 Dollar coins: " + this.change.number5DollarCoins);
        }
    }
}
