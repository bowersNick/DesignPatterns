package behavioral.state;

public class VendingMachine {
    private State idleState;
    private State hasOneDollarState;
    private State outOfStockState;

    private State currentState;
    private int count;
    public VendingMachine(int count) {
        idleState = new IdleState();
        hasOneDollarState = new HasOneDollarState();
        outOfStockState = new OutOfStockState();
        if (count > 0) {
            currentState = idleState;
            this.count = count;
        } else {
            currentState = outOfStockState;
            this.count = 0;
        }
    }
    public void insertDollar() {
        this.currentState.insertDollar(this);
    }
    public void doReturnMoney() {
        this.currentState.ejectMoney(this);
    }
    public void doReleaseProduct() {
        this.currentState.dispense(this);
    }
    public int getCount() {
        return this.count;
    }

    public void setState(State state) {
        currentState = state;
    }

    public State getHasOneDollarState() {
        return hasOneDollarState;
    }
    public State getIdleState() {
        return idleState;
    }
    public State getOutOfStockState() {
        return outOfStockState;
    }
}
