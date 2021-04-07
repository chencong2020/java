package com.study.proxy.demo;

/**
 * 代理类
 *
 * @author chencong
 * @date 2021/4/7
 */
public class Proxy extends Subject {
    RealSubject realSubject;

    @Override
    public void request() {
        if (realSubject == null) {
            realSubject = new RealSubject();
        }
        realSubject.request();
    }
}