package com.prepared.factory;

public class RedisCounter {
    private String ipAddress;
    private String port;

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public RedisCounter(String ipAddress, String port) {
        this.ipAddress = ipAddress;
        this.port = port;
    }  //...
}