package org.saga.designpatten.adaper;

public class Adapter implements Target {
    private Adaptee adaptee;
    
    public Adapter(Adaptee adaptee){
        this.adaptee = adaptee;
    }
    
    /**
     * 源类Adaptee有方法sampleOperation
     * 因此适配器类直接委派即可
     */
	public void act() {
		this.adaptee.sampleOperation();		
	}
	
	public void operate() {
		//写相关的代码
		
	}
}


