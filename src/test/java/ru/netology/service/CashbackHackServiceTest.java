package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void remain() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.Remain(amount);
        int expected = 0;
        assertEquals(actual, expected);
    }

    @Test
    public void remain2() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int actual = service.Remain(amount);
        int expected = 100;
        assertEquals(actual, expected);
    }

    @Test
    public void remain3() {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;
        int actual = service.Remain(amount);
        int expected = 1000;
        assertEquals(actual, expected);
    }

    @Test
    public void remain4() {
        CashbackHackService service = new CashbackHackService();
        int amount =  100;
        int actual = service.Remain(amount);
        int expected =  900;
        assertEquals(actual, expected);
    }

    @Test
    public void remain5() {
        CashbackHackService service = new CashbackHackService();
        int amount = 400;
        int actual = service.Remain(amount);
        int expected =   600;
        assertEquals(actual, expected);
    }
}