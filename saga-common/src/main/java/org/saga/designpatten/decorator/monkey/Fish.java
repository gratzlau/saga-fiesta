package org.saga.designpatten.decorator.monkey;

public class Fish extends Change {
    
    public Fish(TheGreatestSage sage) {
        super(sage);
    }

    @Override
    public void move() {
        // 代码
    	super.move();
        System.out.println("Fish Move");
    }
}




