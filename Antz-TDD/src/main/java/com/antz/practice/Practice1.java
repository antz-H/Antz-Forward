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
        return count(days, perStartAdd);
    }

    private static int count(int days, int weekStartValue) {
        if (days < 7) {
            return saveMoneyForDays2(weekStartValue, days);
        } else {
            return saveMoneyForDays2(weekStartValue, 7) + count(days - 7, weekStartValue + 1);
        }
    }

    private static int saveMoneyForDays2(int start, int n) {
        int money = n * start + n * (n - 1) / 2;
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


}
