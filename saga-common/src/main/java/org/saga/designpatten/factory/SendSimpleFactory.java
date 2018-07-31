package org.saga.designpatten.factory;

import org.saga.designpatten.factory.impl.MailSender;
import org.saga.designpatten.factory.impl.SmsSender;

public class SendSimpleFactory {  
	  
    public Sender produce(String type) {  
        if ("mail".equals(type)) {  
            return new MailSender();  
        } else if ("sms".equals(type)) {  
            return new SmsSender();  
        } else {  
            System.out.println("请输入正确的类型!");  
            return null;  
        }  
    }  
}
