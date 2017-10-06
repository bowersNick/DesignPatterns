package structural.facade;

import java.math.BigDecimal;

public class Investment implements IAccount {
    private BigDecimal amount;
    public Investment(BigDecimal amount) {
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
