package model.entities;

import model.exceptions.AccountException;

public class Account {
    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public Account(Integer number, String holder, Double balance, Double withdrawLimit) throws AccountException {
        setNumber(number);
        setHolder(holder);
        setWithdrawLimit(withdrawLimit);
        this.balance = 0.0;
        deposit(balance);
    }

    public void deposit(Double amount) throws AccountException {
        if (AccountException.isNullLessThanOrEqualZero(amount)) {
            throw new AccountException("Deposit's value cannot be null or less/equal zero!");
        }
        balance += amount;
    }

    public void withdraw(Double amount) throws AccountException {
        if (AccountException.isNullLessThanOrEqualZero(amount)) {
            throw new AccountException("Withdraw's value cannot be null or less/equal zero!");
        }
        if (amount > getWithdrawLimit()) {
            throw new AccountException("Withdraw's value cannot be greater than withdraw's limit!");
        }
        if (amount > getBalance()) {
            throw new AccountException("Withdraw's value cannot be greater than account's balance!");
        }
        balance -= amount;
    }

    public void setHolder(String holder) throws AccountException {
        if (AccountException.isNullOrEmpty(holder)) {
            throw new AccountException("Invalid value for holder's name!");
        }
        this.holder = holder.trim().toUpperCase();
    }

    public void setWithdrawLimit(Double withdrawLimit) throws AccountException {
        if (AccountException.isNullLessThanOrEqualZero(withdrawLimit)) {
            throw new AccountException("Withdraw's limit cannot be null or less/equal zero!");
        }
        this.withdrawLimit = withdrawLimit;
    }

    private void setNumber(Integer number) throws AccountException {
        if (AccountException.isNullLessThanOrEqualZero(number)) {
            throw new AccountException("Account's number cannot be null or less/equal at zero!");
        }
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public Double getBalance() {
        return balance;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public Integer getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return holder + ", $" + balance;
    }
}
