package ru.netology.stats;


public class StatsService {
    public long sum(long[] sales) {
        long FinalSales = 0;
        for (long sale : sales) {
            FinalSales += sale;
        }

        return FinalSales;
    }

    public long average(long[] sales) {
        if (sales.length ==0) {
            return 0;
        }

        return sum(sales) / sales.length;
    }

    public int MaxSales(long[] sales) {
        int month =0;
        for(int i= 0; i < sales.length;i++) {
            if (sales[i] >= sales[month]) {
                month = i;

            }
        }
        return month +1;
    }

    public int MinSales(long[] sales) {
        int month =0;
        for(int i= 0; i < sales.length;i++) {
            if (sales[i] <= sales[month]) {
                month = i;

            }
        }
        return month +1;
    }


    public int MonthHighSales(long[] sales) {
        int counter = 0;
        for(long sale : sales) {
            if (sale > average(sales)) {
                counter++;

            }
        }
        return counter;
    }
    public int MonthLowSales(long[] sales) {
        int counter = 0;
        for(long sale : sales) {
            if (sale < average(sales)) {
                counter++;

            }
        }
        return counter;

    }
}