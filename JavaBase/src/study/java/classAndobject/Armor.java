package study.java.classAndobject;

import study.java.objectOriented.Item;

public class Armor extends Item {
    private int ac;
    public Armor(String name, int price, int ac) {
        super(name, price);
        this.ac = ac;
    }
}
