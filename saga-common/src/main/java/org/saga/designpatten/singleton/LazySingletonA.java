package org.saga.designpatten.singleton;

/**
 * 由于懒汉式的实现是线程安全的，这样会降低整个访问的速度，而且每次都要判断
 * @author Gavin
 *
 */
public class LazySingletonA {
	
	private static LazySingletonA instance = null;
	
    /**
     * 私有默认构造子
     */
    private LazySingletonA(){}
    
    /**
     * 静态工厂方法
     */
    public static synchronized LazySingletonA getInstance(){
        if(instance == null){
            instance = new LazySingletonA();
        }
        return instance;
    }
}
