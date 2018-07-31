package org.saga.designpatten.facade;

public class Facade {
	
	ModuleA a = new ModuleA();
	ModuleB b = new ModuleB();
	ModuleC c = new ModuleC();
	
    //示意方法，满足客户端需要的功能
    public void test(){        
        a.testA();      
        b.testB();       
        c.testC();
    }
}






