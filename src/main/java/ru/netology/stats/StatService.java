package ru.netology.stats;

public class StatService {

    public int calculateSum(int[] purchases) { // подсчет суммы продаж
        int sum = 0; // переменная для суммы
        for (int purchase : purchases) {
            // sum = sum + purchase;
            sum += purchase;
        }
        return sum;
    }

    public double calculateMiddleSum(int[] purchases) { // средняя сумма в месяц
        double sum = calculateSum(purchases); // вызов метода для вычисления суммы продаж и преобразование в тип double
        double MiddleSum = sum / purchases.length;
        return MiddleSum;
    }

    public int calculateMaxMonth(int[] purchases) { // номер месяца максимальной продажи
        int maxMonth = 0;
        for (int i = 1; i < purchases.length; i++) {
            if (purchases[maxMonth] <= purchases[i]) {
                maxMonth = i;
            }
        }
        maxMonth += 1;
        return maxMonth;
    }

    public int calculateMinMonth(int[] purchases) { // номер месяца минимальеых продаж
        int minMonth = 0;
        for (int i = 1; i < purchases.length; i++) {
            if (purchases[minMonth] >= purchases[i]) {
                minMonth = i;
            }
        }
        minMonth += 1;
        return minMonth;
    }

    public int calculateCounterUnderAverage(int[] purchases) { // кол-во месяцев, когда продажи меньше среднего
        int counter = 0;
        double averageSum = calculateMiddleSum(purchases);
        for (int purchase : purchases) {
            if (purchase < averageSum) {
                counter += 1;
            }
        }
        return counter;
    }

    public int calculateCounterUpperAverage(int[] purchases) { // кол-во месяцев, когда продажи больше среднего
        int counter = 0;
        double averageSum = calculateMiddleSum(purchases);
        for (int purchase : purchases) {
            if (purchase > averageSum) {
                counter += 1;
            }
        }
        return counter;
    }
}
