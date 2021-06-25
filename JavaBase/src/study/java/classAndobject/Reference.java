package study.java.classAndobject;

import study.java.objectOriented.Hero;

public class Reference {
    public static void main(String[] args) {
        Hero h1 = new Hero("盖伦", 800, 65, 5, 285);
        Hero h2 = new Hero("提莫", 650, 70, 8, 295);
        Hero h3;
        Hero h4;
        h3 = h1;
        h4 = h3;
        System.out.println("h1:"+h1);
        System.out.println("h2:"+h2);
        System.out.println("h3:"+h3);
        System.out.println("h4:"+h4);
    }
}
