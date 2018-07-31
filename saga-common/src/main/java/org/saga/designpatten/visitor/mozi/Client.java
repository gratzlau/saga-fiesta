package org.saga.designpatten.visitor.mozi;

public class Client {

    public static void main(String[] args) {
    	testMozi();
    }
    
    public static void testBlack() {
        Horse h = new BlackHorse();
        h.eat();
    }
    
    public static void testMozi() {
    	Horse wh = new WhiteHorse();
        Horse bh = new BlackHorse();
        Mozi mozi = new Mozi();
        mozi.ride(wh);
        mozi.ride(bh);
    }
    
    

}







