package org.saga.designpatten.factory.impl;

import org.saga.designpatten.factory.Sender;


public class MailSender implements Sender {  
    @Override  
    public void send() {  
        System.out.println("this is mailsender!");  
    }  
}  

