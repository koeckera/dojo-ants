package de.sz.apps;

public class Field {
    private boolean hasFood;

    public Field(RandomSource randomSource) {
        if (randomSource.flipCoin() == RandomSource.Result.HEADS) {
            this.hasFood = true;
        }
    }

    public boolean hasFood() {
        return hasFood;
    }
}
