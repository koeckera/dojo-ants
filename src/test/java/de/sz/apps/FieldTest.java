package de.sz.apps;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class FieldTest {
    @Test
    public void foodSourceHasFood() {
        Field field = new Field(new RandomSource() {
            @Override
            public Result flipCoin() {
                return Result.HEADS;
            }
        });

        assertTrue(field.hasFood());
    }
}