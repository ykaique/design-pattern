package br.com.cod3r.observer.party.after.observer;

public class Wife implements Observer {

    public void partyTime() {
        System.out.println("Lets Party!!");
    }

    @Override
    public void update(boolean status) {
        if (status) {
            partyTime();
        } else {
            System.out.println("Hold...");
        }
    }
}
