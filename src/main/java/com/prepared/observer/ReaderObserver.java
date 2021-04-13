package com.prepared.observer;

import com.sun.istack.internal.NotNull;

import java.util.Observable;
import java.util.Observer;

/**
 * 观察者-多个
 *
 * @Author: zhongshibo
 * @Date: 2021/4/13 09:20
 */
public class ReaderObserver implements Observer {

    @NotNull
    private String name;

    private String article;

    public ReaderObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        // 更新文章
        updateArticle(o);
    }

    private void updateArticle(Observable o) {
        JavaStackObservable javaStackObservable = (JavaStackObservable) o;
        this.article = javaStackObservable.getArticle();
        System.out.printf("reader1: %s，文章已更新为：%s\n", this.name, this.article);
    }
}
