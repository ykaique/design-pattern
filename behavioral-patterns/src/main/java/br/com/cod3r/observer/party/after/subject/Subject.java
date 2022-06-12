package br.com.cod3r.observer.party.after.subject;

import br.com.cod3r.observer.party.after.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    private List<Observer> observers = new ArrayList<Observer>();
    
    public void add(Observer observer){
        observers.add(observer);
    }
    
    public void notifyObservers(boolean status){
        observers.forEach(o -> o.update(status));
    }
}
