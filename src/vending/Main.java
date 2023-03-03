package vending;

import java.util.Scanner;

// Vending Machine
// Huda BM
// OPP

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        VendingMachineInterface machineInterface = new VendingMachineInterface.TextVendingMachineInterface();
        machineInterface.displayProducts();
        String selectedProduct = scanner.nextLine();
        machineInterface.selectProduct(Integer.parseInt(selectedProduct));
        machineInterface.displayEnterCoinsMessage();
        String userEnteredCoins = scanner.nextLine();
        int[] enteredCoins = Coin.parseCoins(userEnteredCoins);
        machineInterface.enterCoins(enteredCoins);
        machineInterface.displayChangeMessage();
    }
}
