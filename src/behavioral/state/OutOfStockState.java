package behavioral.state;

public class OutOfStockState implements State {
    @Override
    public void insertDollar(VendingMachine vendingMachine) {
        System.out.println("no stock available");
        vendingMachine.doReturnMoney();
    }

    @Override
    public void ejectMoney(VendingMachine vendingMachine) {
        System.out.println("returning money");
    }

    @Override
    public void dispense(VendingMachine vendingMachine) {
        System.out.println("out of stock");
    }
}
