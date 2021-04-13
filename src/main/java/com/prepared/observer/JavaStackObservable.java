package com.prepared.observer;

import java.util.Observable;

/**
 * 观察目标：栈长
 *
 * @Author: zhongshibo
 * @Date: 2021/4/13 09:17
 */
public class JavaStackObservable extends Observable {

    private String article;

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    public void publish(String article) {
        // 发布文章
        this.article = article;
        // 改变状态
        this.setChanged();
        // 通知所有的观察者
        this.notifyObservers();
    }
}
