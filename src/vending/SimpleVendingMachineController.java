package vending;

public class SimpleVendingMachineController implements VendingMachineController {
    private Calculator calculator = new SimpleCalculator();

    public SimpleVendingMachineController() {
    }

    public CoinBundle calculateChange(VendingMachineRequest request) {
        int total = this.calculator.calculateTotal(request.enteredCoins);
        int totalChange = total - request.product.getPrice();
        return this.calculator.calculateChange(totalChange);
    }
}
