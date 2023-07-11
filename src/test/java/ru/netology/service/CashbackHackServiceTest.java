package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldReturn1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;

        int actual = service.remain(amount);
        int expected = 1000;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturn600() {
        CashbackHackService service = new CashbackHackService();
        int amount = 400;

        int actual = service.remain(amount);
        int expected = 600;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturn0() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturn900() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1100;

        int actual = service.remain(amount);
        int expected = 900;

        assertEquals(actual, expected);
    }

}