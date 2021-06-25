package study.java.classAndobject;

import study.java.objectOriented.Hero;

public class SupportHero extends Hero {

    public SupportHero(String name, float hp, float armor, float attack, int moveSpeed) {
        super(name, hp, armor, attack, moveSpeed);
    }

    public void heal(){
        System.out.println("治疗小兵");
    }
    public void heal(Hero... heroes){
        for (Hero hero : heroes) {
            System.out.println("治疗了"+hero.getName()+"5滴血");
        }
    }
    public void heal(Hero hero, int blood){
        System.out.println("治疗了"+hero.getName()+blood+"滴血");
    }
}
