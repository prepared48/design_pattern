package com.prepared.strategy.demo2;

import java.util.HashMap;
import java.util.Map;

/**
 * 使用工厂模式 创建策略
 *
 * @Author: zhongshibo
 * @Date: 2021/4/27 15:06
 */
public class DiscountStrategyFactory {

    private static final Map<OrderType, DiscountStrategy> strategies = new HashMap<>();

    static {
        strategies.put(OrderType.NORMAL, new NormalDiscountStrategy());
        strategies.put(OrderType.GROUPON, new GrouponDiscountStrategy());
        strategies.put(OrderType.PROMOTION, new PromotionDiscountStrategy());
    }

    public static DiscountStrategy getDiscountStrategy(OrderType type) {
        return strategies.get(type);
    }
}
