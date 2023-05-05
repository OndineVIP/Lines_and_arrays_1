package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class StatServiceTest {

    @Test
    public void testSum() {
        ru.netology.stats.StatsService service = new ru.netology.stats.StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.sum(sales);
        long expected = (8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18);

        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void testAverage() {
        ru.netology.stats.StatsService service = new ru.netology.stats.StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.average(sales);
        long expected = (8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18) / 12;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void TestMonthMaxSales() {
        ru.netology.stats.StatsService service = new ru.netology.stats.StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.MaxSales(sales);
        long expected = 8;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void TestMonthMinSales() {
        ru.netology.stats.StatsService service = new ru.netology.stats.StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.MinSales(sales);
        long expected = 9;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void TestMonthHighSales() {
        ru.netology.stats.StatsService service = new ru.netology.stats.StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.MonthHighSales(sales);
        long expected = 5;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void TestMonthLowSales() {
        ru.netology.stats.StatsService service = new ru.netology.stats.StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.MonthLowSales(sales);
        long expected = 5;

        Assertions.assertEquals(expected, actual);
    }
}

