package org.saga.designpatten.state.light;

public class Light {  
	  
    private State state;
    private State prvState;
    private int countTimes = 3;
    private int count = 0;
      
    private void change(){  
        state.change(this);
    }  
  
    public void work(){    	
        while(count < countTimes){  
            change();  
        }  
    }  
    public Light(State state) {  
        super();  
        this.state = state;  
    }  
  
    public State getState() {  
        return state;  
    }  
  
    public void setState(State state) {  
        this.state = state;  
    }

	public State getPrvState() {
		return prvState;
	}

	public void setPrvState(State prvState) {
		this.prvState = prvState;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}  
      
}








