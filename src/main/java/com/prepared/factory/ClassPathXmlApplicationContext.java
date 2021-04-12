package com.prepared.factory;


import java.io.*;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;

/**
 * @Author: zhongshibo
 * @Date: 2021/4/12 16:11
 */
public class ClassPathXmlApplicationContext implements ApplicationContext {

    private BeansFactory beansFactory;

    private BeanConfigParser beanConfigParser;

    public ClassPathXmlApplicationContext(String configLocation) {
        this.beansFactory = new BeansFactory();
        this.beanConfigParser = new XmlBeanConfigParser();
        loadBeanDefinition(configLocation);
    }

    private void loadBeanDefinition(String configLocation) {
        InputStream in = null;
        try {
//            in = this.getClass().getResourceAsStream("/" + configLocation);
            URL url = this.getClass().getClassLoader().getResource(configLocation);
            try {
                in = new FileInputStream(new File(url.toURI()));
            } catch (URISyntaxException e) {
                e.printStackTrace();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            if (in == null) {
                throw new RuntimeException("Can not find config file: " + configLocation);
            }
            List<BeanDefinition> beanDefinitions = beanConfigParser.parse(in);
            beansFactory.addBeanDefinitions(beanDefinitions);
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    // log error
                }
            }
        }
    }

    @Override
    public Object getBean(String beanId) {
        return beansFactory.getBean(beanId);
    }
}
