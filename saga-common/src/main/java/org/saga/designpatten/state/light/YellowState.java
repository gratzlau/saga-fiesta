package org.saga.designpatten.state.light;

public class YellowState implements State {  
    private static final Long SLEEP_TIME = 500L;  
    @Override  
    public void change(Light light) {  
          
        System.out.println("现在是黄灯，警示");  
        //红灯亮0.5秒  
        try {  
            Thread.sleep(SLEEP_TIME);  
        } catch (InterruptedException e) {  
            // TODO Auto-generated catch block  
            e.printStackTrace();  
        }
        if(light.getPrvState() instanceof GreenState){
        	light.setState(new RedState()); 
        }else if(light.getPrvState() instanceof RedState){
        	light.setState(new GreenState()); 
        }else{
        	light.setState(new GreenState()); 
        }
         
    }  
  
}  








