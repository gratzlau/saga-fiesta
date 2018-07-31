package org.saga.designpatten.builder.message;

public class Client {
    
    public static void main(String[] args) {
    	Builder builder = new GoodbyeBuilder();
        Director director = new Director(builder);
        director.construct("toAddress@126.com", "fromAddress@126.com");        
    }

}
