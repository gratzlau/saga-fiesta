package org.saga.designpatten.factory;

import org.saga.designpatten.factory.impl.SendMailFactory;

public class SendAbstractFactory {  
	  
	public static void main(String[] args) {  
        Provider provider = new SendMailFactory();  
        Sender sender = provider.produce();  
        sender.send();  
    } 
}
