package com.prepared.spring.proxy.aobing;

/**
 * @Author: zhongshibo
 * @Date: 2021/4/12 14:16
 */
public class RealData implements Data {

    protected final String result;

    public RealData(String para) {
        StringBuffer sb = new StringBuffer();
        sb.append(para);
        result = sb.toString();
    }

    @Override
    public String getResult() {
        return result;
    }
}
