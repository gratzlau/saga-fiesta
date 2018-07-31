package org.saga.designpatten.factory;

import org.saga.designpatten.factory.impl.MailSender;
import org.saga.designpatten.factory.impl.SmsSender;

public class SendStaticFactory {  
	  
    public static Sender produceMail(){  
        return new MailSender();  
    }  
      
    public static Sender produceSms(){  
        return new SmsSender();  
    }
}
