package com.antz.practice;

/**
 * @author huang.huang
 * @description
 * @date 2021/8/26 13:11
 **/
public class Practice1 {


    public static int countMoney(final int days) {
        int totalMoney = 0;
        int weeks = days / 7;
        int curWeek = 0;

        int perAdd = 1;
        while (curWeek <= weeks) {

            if (curWeek == weeks) {
                totalMoney = totalMoney + saveMoneyForDays(perAdd, days % 7);
            } else {
                totalMoney = totalMoney + saveMoneyForDays(perAdd, 7);
            }
            perAdd++;
            curWeek++;
        }
        return totalMoney;
    }


    public static int countMoney1(final int days) {
        int totalMoney = 0;
        int weeks = days / 7;
        int perAdd = 1;

        for (int curWeek = 0; curWeek <= weeks; curWeek++) {
            if (curWeek == weeks) {
                totalMoney = totalMoney + saveMoneyForDays(perAdd, days % 7);
            } else {
                totalMoney = totalMoney + saveMoneyForDays(perAdd, 7);
            }
            perAdd++;
        }
        return totalMoney;
    }

    public static int countMoney2(final int days) {
        int totalMoney = 0;
        int weeks = days / 7;
        int perAdd = 1;

        for (int curWeek = 0; curWeek <= weeks; curWeek++) {
            if (curWeek == weeks) {
                totalMoney = totalMoney + saveMoneyForDays2(perAdd, days % 7);
            } else {
                totalMoney = totalMoney + saveMoneyForDays2(perAdd, 7);
            }
            perAdd++;
        }
        return totalMoney;
    }

    public static int countMoney3(final int days) {
        int perStartAdd = 1;
        return count(perStartAdd, days);
    }

    private static int count(int weekStartValue, int days) {
        if (days < 7) {
            return saveMoneyForDays2(weekStartValue, days);
        } else {
            return saveMoneyForDays2(weekStartValue, 7) + count(weekStartValue + 1, days - 7);
        }
    }

    private static int saveMoneyForDays2(int start, int n) {
        int money = n * start + n * (n - 1) / 2;
        System.out.println(start + "--" + n + "---" + money);
        return money;
    }


    private static int saveMoneyForDays(int perStartAdd, int n) {
        int money = 0;
        while (n > 0) {
            money = money + perStartAdd;
            perStartAdd++;
            n--;
        }
        return money;
    }


    public static int countByTailRecursion(int days) {
        int weekStartValue = 1;
        int weeks = days / 7;
        int totalMoney = 0;
        return tailRecursion(weeks, weekStartValue, days, totalMoney);
    }

    private static int tailRecursion(int weeks, int weekStartValue, int calculDays, int money) {
        if (weeks == 0) {
            return money + saveMoneyForDays2(weekStartValue, calculDays);
        } else {
            return tailRecursion(weeks - 1, weekStartValue + 1, calculDays - 7, money + saveMoneyForDays2(weekStartValue, 7));
        }
    }

    public static int countByTailRecursion2(int days) {
        int weekStartValue = 1;
        int totalMoney = 0;
        if (days <= 7) {
            return saveMoneyForDays2(weekStartValue, days);
        } else {
            return saveMoneyForDays2(weekStartValue, 7) + tailRecursion2(weekStartValue +1, days, totalMoney);
        }
    }

    private static int tailRecursion2(int weekStartValue, int days, int money) {
        if (days < 7) {
            return money + saveMoneyForDays2(weekStartValue, days);
        } else {
            return tailRecursion2(weekStartValue + 1, days - 7, money + saveMoneyForDays2(weekStartValue, 7));
        }
    }
}
