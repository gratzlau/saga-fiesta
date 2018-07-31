package org.saga.designpatten.builder.message;


public class GoodbyeBuilder extends Builder {

    public GoodbyeBuilder(){
        msg = new GoodbyeMessage();
    }
    
    @Override
    public void buildBody() {
    	msg.setBody("欢送内容");
    }

    @Override
    public void buildSubject() {
    	msg.setSubject("欢送标题");
    }

}
