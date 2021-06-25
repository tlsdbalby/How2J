package study.java.classAndobject;

import study.java.objectOriented.Item;

public class Weapon extends Item {
    private int damage;
    private String str = "1";
    private String str2 = str;
    public Weapon(String name, int price, int damage) {
        super(name, price);
        this.damage = damage;
        str = "2";
        System.out.println("str:"+str);
        System.out.println("str2:"+str);
    }
}
