package de.sz.apps;

import java.util.Observable;
import java.util.Observer;

public class Ant implements Observer {

    private AntState state = AntState.AT_HIVE;
    protected boolean foundFood;

    public Ant(Clock clock) {
        clock.addObserver(this);
    }

    public void startSearching() {
        state = AntState.SEARCHING;
    }

    public AntState getState() {
        return state;
    }

    @Override
    public void update(Observable o, Object arg) {
        state = AntState.SEARCHING;
        this.search();
    }

    protected void search() {
    }

    public boolean foundFood() {
        return foundFood;
    }
}
