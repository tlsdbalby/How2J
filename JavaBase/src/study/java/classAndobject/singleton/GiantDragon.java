package study.java.classAndobject.singleton;

public class GiantDragon {
    // 使用单例模式设计此类 保证全局只有一个此类的实例对象, 所有需要此类对象的地方,都是同一个对象(将这个类的对象从对象级提升至类级)

    //0. 声明一个此类的静态引用 保证全局唯一
    // 懒汉模式: 不在声明处实例化,在首次使用时实例化, 优点:程序加载快 缺点:此对象首次使用会慢一点
    private static GiantDragon giantDragon;
    // 饿汉模式: 在声明处实例化, 优点:在初次使用时反应快 缺点:程序加载会慢一点
//    private static GiantDragon giantDragon = new GiantDragon();

    //1. 私有化构造函数 保证外部无法调用此构造,即外部无法实例化此类,创建此类的对象,只能有本类能创建本类对象（比较绕,但确实有效）
    private GiantDragon(){
        System.out.println("创建大龙！");
    }

    //2. 开放一个获取静态实例的方法 在本类中创建实例化对象,并与静态引用绑定
    public static GiantDragon getGiantDragonSingleton(){
        if (giantDragon == null)
            giantDragon = new GiantDragon();
        return giantDragon;
    }
}
