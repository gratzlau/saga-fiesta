package org.saga.designpatten.flyweight;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * 享元模式的优点在于它大幅度地降低内存中对象的数量。但是，它做到这一点所付出的代价也是很高的：

　　●　　享元模式使得系统更加复杂。为了使对象可以共享，需要将一些状态外部化，这使得程序的逻辑复杂化。

　　●　　享元模式将享元对象的状态外部化，而读取外部状态使得运行时间稍微变长。
 * 
 * @author Gavin
 *
 */
public class Client {

    public static void main(String[] args) {
        List<Character> compositeState = new ArrayList<Character>();
        compositeState.add('a');
        compositeState.add('b');
        compositeState.add('c');
        compositeState.add('a');
        compositeState.add('b');
        
        FlyweightFactory flyFactory = new FlyweightFactory();
        Flyweight compositeFly1 = flyFactory.factory(compositeState);
        Flyweight compositeFly2 = flyFactory.factory(compositeState);
        compositeFly1.operation("Composite Call");
        
        System.out.println("---------------------------------");        
        System.out.println("复合享元模式是否可以共享对象：" + (compositeFly1 == compositeFly2));
        
        Character state = 'a';
        Flyweight fly1 = flyFactory.factory(state);
        Flyweight fly2 = flyFactory.factory(state);
        System.out.println("单纯享元模式是否可以共享对象：" + (fly1 == fly2));
    }
}






