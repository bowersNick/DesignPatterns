package structural.facade;

import java.math.BigDecimal;

public class Checking implements IAccount {
    private BigDecimal amount;
    public Checking(BigDecimal amount) {
        this.amount = amount;
    }

    @Override
    public void deposit(BigDecimal amount) {

    }

    @Override
    public void withdraw(BigDecimal amount) {

    }

    @Override
    public void transfer(IAccount account, BigDecimal amount) {

    }

    @Override
    public int getAccountNumber() {
        return 0;
    }
}
