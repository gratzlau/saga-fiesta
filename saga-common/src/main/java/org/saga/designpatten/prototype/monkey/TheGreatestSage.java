package org.saga.designpatten.prototype.monkey;


public class TheGreatestSage {
    private Monkey monkey = new Monkey();
    
    public void change(){
        //克隆大圣本尊
        Monkey copyMonkey = (Monkey)monkey.clone();
        //Monkey copyMonkey = (Monkey)monkey.deepClone();
        System.out.println("大圣本尊的生日是：" + monkey.getBirthDate());
        System.out.println("克隆的大圣的生日是：" + copyMonkey.getBirthDate());
        System.out.println("大圣本尊跟克隆的大圣是否为同一个对象 " + (monkey == copyMonkey));
        System.out.println("大圣本尊持有的金箍棒 跟 克隆的大圣持有的金箍棒是否为同一个对象？ " + (monkey.getStaff() == copyMonkey.getStaff()));
    }
    
    public static void main(String[]args){
        TheGreatestSage sage = new TheGreatestSage();
        sage.change();
    }
}
