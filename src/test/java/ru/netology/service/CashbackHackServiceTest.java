package ru.netology.service;


import org.junit.Test;

import    org.junit.Assert;

public class CashbackHackServiceTest {


    @Test
    public void remain2() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;

        int expected = 100;
        int actual = service.Remain(amount);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void remain3() {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;
        int actual = service.Remain(amount);
        int expected = 1000;
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void remain4() {
        CashbackHackService service = new CashbackHackService();
        int amount = 100;
        int actual = service.Remain(amount);
        int expected = 900;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void remain5() {
        CashbackHackService service = new CashbackHackService();
        int amount = 400;
        int actual = service.Remain(amount);
        int expected = 600;
        Assert.assertEquals(expected, actual);
    }


}