package org.saga.designpatten.factory;

import org.saga.designpatten.factory.impl.MailSender;
import org.saga.designpatten.factory.impl.SmsSender;

public class SendFactory {  
	  
	public Sender produceMail(){  
        return new MailSender();  
    }  
      
    public Sender produceSms(){  
        return new SmsSender();  
    }  
}
