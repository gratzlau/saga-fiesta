package org.saga.designpatten.singleton;

/**
 * 提示：由于volatile关键字可能会屏蔽掉虚拟机中一些必要的代码优化，所以运行效率并不是很高。
 * 因此一般建议，没有特别的需要，不要使用。也就是说，虽然可以使用“双重检查加锁”机制来实现线程安全的单例，但并不建议大量采用，
 * 可以根据情况来选用。
 * @author Gavin
 *
 */
public class LazySingletonB {

	private volatile static LazySingletonB instance = null;

	private LazySingletonB() {}

	public static LazySingletonB getInstance() {
		// 先检查实例是否存在，如果不存在才进入下面的同步块
		if (instance == null) {
			// 同步块，线程安全的创建实例
			synchronized (LazySingletonB.class) {
				// 再次检查实例是否存在，如果不存在才真正的创建实例
				if (instance == null) {
					instance = new LazySingletonB();
				}
			}
		}
		return instance;
	}
}
