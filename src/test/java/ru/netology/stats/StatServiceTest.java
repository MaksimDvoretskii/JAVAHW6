package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatServiceTest {

    @Test
    void calculateSum() {
        StatService service = new StatService();
        int[] purchase = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = service.calculateSum(purchase);
        assertEquals(expected, actual);
    }

    @Test
    void calculateMiddleSum() {
        StatService service = new StatService();
        int[] purchase = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        double actual = service.calculateMiddleSum(purchase);
        assertEquals(expected, actual);
    }

    @Test
    void calculateMaxMonth() {
        StatService service = new StatService();
        int[] purchase = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.calculateMaxMonth(purchase);
        assertEquals(expected, actual);
    }

    @Test
    void calculateMinMonth() {
        StatService service = new StatService();
        int[] purchase = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.calculateMinMonth(purchase);
        assertEquals(expected, actual);
    }

    @Test
    void calculateCounterUnderAverage() {
        StatService service = new StatService();
        int[] purchase = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.calculateMinMonth(purchase);
        assertEquals(expected, actual);
    }

    @Test
    void calculateCounterUpperAverage() {
        StatService service = new StatService();
        int[] purchase = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.calculateMinMonth(purchase);
        assertEquals(expected, actual);
    }
}