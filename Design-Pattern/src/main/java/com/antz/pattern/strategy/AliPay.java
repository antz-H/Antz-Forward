package com.antz.pattern.strategy;

/**
 * @author huang.huang
 * @description
 * @date 2022/3/30 22:23
 **/
public class AliPay implements IPay {
    @Override
    public boolean pay(String money) {
        return false;
    }
}
