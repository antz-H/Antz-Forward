package com.antz.pattern.strategy;

/**
 * @author huang.huang
 * @description
 * @date 2022/3/30 22:39
 **/
public class PayFactory {

    public static IPay getPay(String payType) {

        if ("WX".equals(payType)) {
            return new WXPay();
        } else if ("ALI".equals(payType)) {
            return new AliPay();
        }
        return null;
    }

}
