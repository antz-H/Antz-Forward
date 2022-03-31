package com.antz.pattern.strategy;

/**
 * @author huang.huang
 * @description
 * @date 2022/3/30 22:35
 **/
public class PayStrategyContext {

    private IPay iPay;

    public PayStrategyContext(IPay iPay) {
        this.iPay = iPay;
    }


    public void pay(Double money) {
        iPay.pay(money);
    }
}
