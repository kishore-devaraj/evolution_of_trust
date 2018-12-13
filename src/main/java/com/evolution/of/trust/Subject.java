package com.evolution.of.trust;

public interface Subject {
    public void subscribe (Player observer);
    public void notifyObservers ();
}
