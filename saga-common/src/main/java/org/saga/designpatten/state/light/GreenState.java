package org.saga.designpatten.state.light;

public class GreenState implements State {  
    private static final Long SLEEP_TIME = 2000L;  
    @Override  
    public void change(Light light) {  
          
        System.out.println("现在是绿灯，可以通行");  
        //绿灯亮1秒  
        try {  
            Thread.sleep(SLEEP_TIME);  
        } catch (InterruptedException e) {  
            // TODO Auto-generated catch block  
            e.printStackTrace();  
        }
        light.setPrvState(this);
        light.setState(new YellowState());  
    }  
  
} 








