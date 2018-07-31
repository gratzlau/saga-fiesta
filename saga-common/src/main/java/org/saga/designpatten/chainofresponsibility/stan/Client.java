package org.saga.designpatten.chainofresponsibility.stan;

public class Client {

    public static void main(String[] args) {
        //组装责任链
        Handler handler1 = new ConcreteHandler();
        Handler handler2 = new ConcreteHandler();
        Handler handler3 = new ConcreteHandler();
        handler2.setSuccessor(handler3);
        handler1.setSuccessor(handler2);
        
        //提交请求
        handler1.handleRequest();
        
    }

}






