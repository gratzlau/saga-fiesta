package org.saga.designpatten.decorator.monkey;

public class Client {

    public static void main(String[] args) {
        TheGreatestSage sage = new Monkey();
        // 第一种写法
        TheGreatestSage bird = new Bird(sage);
        bird.move();
        TheGreatestSage fish = new Fish(bird);
        fish.move();
        // 第二种写法
        //TheGreatestSage fish = new Fish(new Bird(sage));
        fish.move(); 
    }

}




