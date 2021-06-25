package study.java.classAndobject;

import study.java.objectOriented.Hero;

public class Test {
    public static void main(String[] args) {
        Weapon weapon_1 = new Weapon("代达罗斯之殇", 5100, 81);
        Armor armor_1 = new Armor("希瓦的守护", 4500, 15);
        System.out.println(weapon_1);

        SupportHero hero_1 = new SupportHero("暗影牧师", 560, 4, 55, 295);
        Hero hero_2 = new Hero("流浪剑客", 750, 5, 62, 285);
        hero_1.heal();
        hero_1.heal(hero_2);
        hero_1.heal(hero_2, 15);

        for (HeroType heroType : HeroType.values()) {
            String str = "";
            switch (heroType){
                case PUSH:
                    str="PUSH";
                    break;
                case ASSIST:
                    str="ASSIST";
                    break;
                case TANK:
                    str="TANK";
                    break;
                case RANGED:
                    str="RANGED";
                    break;
                case WIZARD:
                    str="WIZARD";
                    break;
                case FARMING:
                    str="FARMING";
                    break;
                case WARRIOR:
                    str="WARRIOR";
                    break;
                case ASSASSIN:
                    str="ASSASSIN";
                    break;
            }
            System.out.println("英雄类型:"+str);
        }
    }
}
