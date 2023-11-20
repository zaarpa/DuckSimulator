package org.example;

public class DuckCall implements Quackable{
    Observable observable;
    public DuckCall() {
        observable = new Observable(this);
    }
    public void quack() {
        System.out.println("Kwak");
        notifyObservers();
    }
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }
    public void notifyObservers() {
        observable.notifyObservers();
    }

    @Override
    public String toString() {
        return "Duck Call";
    }
}
