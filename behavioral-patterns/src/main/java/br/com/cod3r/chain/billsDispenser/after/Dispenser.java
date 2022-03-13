package br.com.cod3r.chain.billsDispenser.after;

public class Dispenser {

    private Bill chain;

    public Dispenser() {
        chain = new Bill(100,
                new Bill(50,
                        new Bill(20,
                                new Bill(10,
                                        new Bill(5,
                                                new Bill(2,
                                                        new Bill(1)))))));
    }

    public Dispenser(Bill... bills) {
        for (int i = 0; i < bills.length - 1; i++) {
            Bill currentBill = bills[i];
            currentBill.setNext(bills[i + 1]);
        }
        chain = bills[0];
    }
    public void withdraw(Integer amount){
        chain.execute(amount);
    }

}
