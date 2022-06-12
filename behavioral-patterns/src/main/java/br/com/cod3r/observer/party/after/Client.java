package br.com.cod3r.observer.party.after;


import br.com.cod3r.observer.party.after.observer.Friend;
import br.com.cod3r.observer.party.after.observer.Wife;
import br.com.cod3r.observer.party.after.subject.Doorman;

public class Client {

    public static void main(String[] args) {
        Doorman doorman = new Doorman();

        doorman.add(new Wife());
        doorman.add(new Friend());

        System.out.println("Husband is coming!");
        doorman.setStatus(true);
        doorman.setStatus(false);
        doorman.setStatus(false);
        doorman.setStatus(true);
        doorman.setStatus(false);
    }

}
