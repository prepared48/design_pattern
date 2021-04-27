package com.prepared.strategy.demo2;

/**
 * 策略的使用
 *
 * @Author: zhongshibo
 * @Date: 2021/4/27 15:11
 */
public class OrderService {

    public double discount(Order order) {
        OrderType type = order.getType();
        DiscountStrategy discountStrategy = DiscountStrategyFactory.getDiscountStrategy(type);
        return discountStrategy.calDiscount(order);
    }

}
