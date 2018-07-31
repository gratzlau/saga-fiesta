package org.saga.designpatten.factory.impl;

import org.saga.designpatten.factory.Sender;


public class SmsSender implements Sender {  
    @Override  
    public void send() {  
    	System.out.println("this is sms sender!"); 
    }  
}  

