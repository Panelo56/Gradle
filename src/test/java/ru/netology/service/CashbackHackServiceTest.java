package ru.netology.service;

import static org.testng.Assert.*;

import org.testng.annotations.Test;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @Test
    public void dfgbvfgb() {
        int amount = 1200;

        int expected = 800;
        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }

    @Test
    public void bvbfgvb() {
        int amount = 800;

        int expected = 200;
        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }

    @Test
    public void bvbfgvbfer() {
        int amount = 999;

        int expected = 1;
        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }

    @Test
    public void bvbfgvbrevegr() {
        int amount = 1001;

        int expected = 999;
        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }
}
