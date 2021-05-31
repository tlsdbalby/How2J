package study.java.objectOriented;

import java.util.Random;

public class Hero {
    private String name;
    private int level;
    private float hp;
    private float armor;
    private float attack;
    private int moveSpeed;
    private int money;
    private int killNumber;
    private int killedNumber;
    private Random rd = new Random();

    public Hero(String name, float hp, float armor,float attack, int moveSpeed) {
        this.name = name;
        this.hp = hp;
        this.armor = armor;
        this.attack = attack;
        this.moveSpeed = moveSpeed;
        level = 1;
        money = 500;
        killNumber = 0;
        killedNumber = 0;
    }

    public void printArmor(){
        System.out.println(name+"护甲是："+armor+"点");
    }

    public void addSpeed(int speed){
        moveSpeed += speed;
    }

    public void workForMoney(){
        money += 40 + rd.nextInt(10);
    }

    public void recoveryHp(float reHp){
        hp += reHp;
    }

    public void beAttacked(float attack){
        hp -= attack;
    }

    public boolean isDeath(){
        return hp<0;
    }

    public void lossMoney(){
        money -= 500;
    }

    public void attackHero(Hero hero){
        System.out.println(name+"攻击了"+hero.getName()+"!");
        while (true){
            if (this.isDeath() && hero.isDeath()){
                System.out.println(this.name+"与"+hero.getName()+"同归于尽了！");
                this.lossMoney();
                this.killedNumber++;
                this.killNumber++;
                hero.lossMoney();
                hero.setKilledNumber(1);
                hero.setKillNumber(1);
                return;
            }
            if (this.isDeath()){
                System.out.println(this.name+"被"+hero.getName()+"杀死了！");
                this.killedNumber++;
                this.lossMoney();
                hero.setKillNumber(1);
                return;
            }
            if (hero.isDeath()){
                System.out.println(hero.getName()+"被"+this.name+"杀死了！");
                this.killNumber++;
                hero.lossMoney();
                hero.setKilledNumber(1);
                return;
            }
            this.beAttacked(hero.getAttack());
            hero.beAttacked(this.getAttack());
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getHp() {
        return hp;
    }

    public void setHp(float hp) {
        this.hp = hp;
    }

    public float getArmor() {
        return armor;
    }

    public void setArmor(float armor) {
        this.armor = armor;
    }

    public float getAttack() {
        return attack;
    }

    public void setAttack(float attack) {
        this.attack = attack;
    }

    public int getMoveSpeed() {
        return moveSpeed;
    }

    public void setMoveSpeed(int moveSpeed) {
        this.moveSpeed = moveSpeed;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getKillNumber() {
        return killNumber;
    }

    public void setKillNumber(int killNumber) {
        this.killNumber += killNumber;
    }

    public int getKilledNumber() {
        return killedNumber;
    }

    public void setKilledNumber(int killedNumber) {
        this.killedNumber += killedNumber;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                ", armor=" + armor +
                ", moveSpeed=" + moveSpeed +
                ", money=" + money +
                ", killNumber=" + killNumber +
                ", killedNumber=" + killedNumber +
                '}';
    }
}
