package de.sz.apps;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

@RunWith(JUnit4.class)
public class AntTest {

    @Test
    public void newAntStartsAtHive() {
        Ant expected = new Ant(new Clock());
        assertEquals(AntState.AT_HIVE, expected.getState());
    }

    @Test
    public void antSearchingForFoodIsNotLocatedAtHive() {
        Ant expected = new Ant(new Clock());
        expected.startSearching();
        assertEquals(AntState.SEARCHING, expected.getState());
    }

    @Test
    public void antStartsMovingOnFirstTick() {
        Clock clock = new Clock();
        Ant expected = new Ant(clock);
        clock.tick();
        assertEquals(AntState.SEARCHING, expected.getState());
    }

    @Test
    public void currentlySearchingAntChecksForFoodEveryTick() {
        Clock clock = new Clock();

        Ant searchingAnt = new Ant(clock) {
            @Override
            protected void search() {
                foundFood = true;
            }
        };
        searchingAnt.startSearching();

        clock.tick();

        assertTrue(searchingAnt.foundFood());
    }
}
