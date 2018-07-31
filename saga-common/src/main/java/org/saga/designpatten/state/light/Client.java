package org.saga.designpatten.state.light;

public class Client {  
	  
    /** 
     *作者：alaric 
     *时间：2013-9-7上午11:27:34 
     *描述： 
     */  
    public static void main(String[] args) {  
          
        //假设路灯开始是绿灯  
        State state = new GreenState();  
        Light light = new Light(state);  
        light.work();  
                  
    }  
  
} 








