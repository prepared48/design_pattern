package com.prepared.chainOfResponsibility.demo2;

/**
 * @Author: zhongshibo
 * @Date: 2021/4/27 16:20
 */
public abstract class Handler {

    protected Handler successor = null;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public final void handle() {
        boolean handled = doHandle();
        if (successor != null && !handled) {
            successor.handle();
        }
    }

    public abstract boolean doHandle();
}
