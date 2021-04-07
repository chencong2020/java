package com.study.proxy.demo;

/**
 * 真实实体类
 *
 * @author chencong
 * @date 2021/4/7
 */
public class RealSubject extends Subject {
    @Override
    public void request() {
        System.out.println("真实的请求");
    }
}