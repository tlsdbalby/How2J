package study.java.objectOriented;

public class Test {
    public static void main(String[] args) {
        Hero garen = new Hero("盖伦", 800, 65, 5, 285);
        Hero teemo = new Hero("提莫", 650, 70, 8, 295);

        for (int i = 0; i < 100; i++) {
            garen.workForMoney();
            teemo.workForMoney();
        }
        garen.attackHero(teemo);
        System.out.println(garen);
        System.out.println(teemo);

    }
}
