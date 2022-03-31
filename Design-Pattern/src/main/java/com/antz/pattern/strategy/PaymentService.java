package com.antz.pattern.strategy;

/**
 * @author huang.huang
 * @description
 * @date 2022/3/30 22:19
 **/
public class PaymentService {

    public void payByStrategy(String orderId, String payType) {

        if ("WX".equals(payType)) {
            new PayStrategyContext(new WXPay()).pay(10d);
        } else if ("ALI".equals(payType)) {
            new PayStrategyContext(new AliPay()).pay(10d);
        }
    }

    public void payByFactory(String orderId, String payType) {

        IPay pay = PayFactory.getPay(payType);

        pay.pay(10d);
    }
}
