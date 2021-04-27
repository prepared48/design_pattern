package com.prepared.strategy;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * 运行时动态确定，根据配置文件的配置决定使用哪种策略【建议使用】
 *
 * @Author: zhongshibo
 * @Date: 2021/4/27 14:15
 */
public class Application1 {

    public static void main(String[] args) {
        EvictionStrategy evictionStrategy = null;
        Properties props = new Properties();
        try {
            props.load(new FileInputStream("./config.properties"));
            String type = props.getProperty("eviction_type");
            evictionStrategy = evictionStrategy.getEvictionStrategy(type);
            UserCache userCache = new UserCache(evictionStrategy);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
