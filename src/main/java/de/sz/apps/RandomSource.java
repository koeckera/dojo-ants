package de.sz.apps;

public interface RandomSource {
    enum Result {
        HEADS,
        TAILS
    }

    Result flipCoin();
}
