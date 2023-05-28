package ru.netology.stats;


class statsService {
    public long sum(long[] sales) {
        long finalSales = 0;
        for (long sale : sales) {
            finalSales += sale;
        }

        return finalSales;
    }

    public long average(long[] sales) {
        if (sales.length == 0) {
            return 0;
        }

        return sum(sales) / sales.length;
    }

    public int maxSales(long[] sales) {
        int month = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[month]) {
                month = i;

            }
        }
        return month + 1;
    }

    public int minSales(long[] sales) {
        int month = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[month]) {
                month = i;

            }
        }
        return month + 1;
    }


    public int monthHighSales(long[] sales) {
        int counter = 0;
        long averageSale = average(sales);
        for (long sale : sales) {
            if (sale > averageSale) {
                counter++;

            }
        }
        return counter;
    }

    public int monthLowSales(long[] sales) {
        int counter = 0;
        long averageSale = average(sales);
        for (long sale : sales) {
            if (sale < averageSale) {
                counter++;

            }
        }
        return counter;

    }
}