package org.saga.designpatten.factory.impl;

import org.saga.designpatten.factory.Provider;
import org.saga.designpatten.factory.Sender;


public class SendSmsFactory implements Provider {  
	@Override  
    public Sender produce(){  
        return new SmsSender();  
    } 
}  

