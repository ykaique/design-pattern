package br.com.cod3r.observer.party.after.observer;

public class Friend implements Observer {

    public void sendGift() {
        System.out.println("Look, I bought your favorite beer!");
    }

    @Override
    public void update(boolean status) {
        if (status) {
            sendGift();
        } else {
            System.out.println("Sleep...");
        }
    }
}
