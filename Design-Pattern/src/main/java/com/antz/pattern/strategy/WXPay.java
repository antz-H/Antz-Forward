package com.antz.pattern.strategy;

/**
 * @author huang.huang
 * @description
 * @date 2022/3/30 22:22
 **/
public class WXPay implements IPay {
    @Override
    public boolean pay(Double money) {
        return false;
    }
}
