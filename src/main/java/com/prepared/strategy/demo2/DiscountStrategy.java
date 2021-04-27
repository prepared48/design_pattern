package com.prepared.strategy.demo2;

/**
 * 策略定义
 *
 * @Author: zhongshibo
 * @Date: 2021/4/27 15:04
 */
public interface DiscountStrategy {

    double calDiscount(Order order);
}
