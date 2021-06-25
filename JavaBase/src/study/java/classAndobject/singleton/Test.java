package study.java.classAndobject.singleton;

public class Test {
    public static void main(String[] args) {
//        小tips：递归调用构造函数，导致栈溢出
//        Loop loop = new Loop();

//        GiantDragon d1 = new GiantDragon();因为构造方法是private, 因此无法实例化
        GiantDragon d1 = GiantDragon.getGiantDragonSingleton();//只在初次调用的时候进行实例化
        GiantDragon d2 = GiantDragon.getGiantDragonSingleton();
        GiantDragon d3 = GiantDragon.getGiantDragonSingleton();
        System.out.println(d1 == d2 && d2 == d3);//三者地址全等,说明都指向同一对象
    }
}
