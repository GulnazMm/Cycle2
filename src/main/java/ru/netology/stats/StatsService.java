package ru.netology.stats;


public class StatsService {
    public int sum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int averageSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
        }
        return sum(sales) / sales.length;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (int sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;

    }

    public int belowAverage(int[] sales) {
        int average = averageSum(sales);
        int count = 0;
        for (int sale : sales) {
            if (sale < average) {
                count++;
            }

        }
        return count;
    }

    public int aboveAverage(int[] sales) {
        int average = averageSum(sales);
        int count = 0;
        for (int sale : sales) {
            if (sale > average) {
                count++;
            }

        }
        return count;
    }
    
}



