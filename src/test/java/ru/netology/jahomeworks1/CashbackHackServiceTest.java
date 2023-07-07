package ru.netology.jahomeworks1;

import org.junit.Test;
import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void testRemainShouldReturnCorrectRemainWhenAmountIsNotMultipleOfBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int expectedRemain = 100;

        int actualRemain = service.remain(amount);

        assertEquals(expectedRemain, actualRemain);
    }

    @Test
    public void testRemainShouldReturnCorrectRemainWhenAmountIsNotExactMultipleOfBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int expectedRemain = 0;

        int actualRemain = service.remain(amount);

        assertEquals(expectedRemain, actualRemain);
    }
}