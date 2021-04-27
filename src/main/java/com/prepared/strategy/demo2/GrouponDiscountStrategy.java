package com.prepared.strategy.demo2;

/**
 * @Author: zhongshibo
 * @Date: 2021/4/27 15:07
 */
public class GrouponDiscountStrategy implements DiscountStrategy {
    @Override
    public double calDiscount(Order order) {
        return 0;
    }
}
