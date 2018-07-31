package org.saga.designpatten.state.light;

public class RedState implements State {  
    private static final Long SLEEP_TIME = 1000L;  
    @Override  
    public void change(Light light) {  
  
        System.out.println("现在是红灯，禁止通行");  
        //红灯亮1秒  
        try {  
            Thread.sleep(SLEEP_TIME);  
        } catch (InterruptedException e) {  
            // TODO Auto-generated catch block  
            e.printStackTrace();  
        }
        light.setPrvState(this);
        light.setState(new YellowState()); 
        light.setCount(light.getCount()+1);
    }  
  
} 








