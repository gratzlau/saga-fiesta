package org.saga.designpatten.adaper;

public class AdapterB extends Adaptee implements Target {
    
    /**
     * 源类Adaptee有方法sampleOperation
     * 因此适配器类直接委派即可
     */
	public void act() {
		super.sampleOperation();		
	}
	
	public void operate() {
		//写相关的代码
		
	}
}


