package study.java.classAndobject.singleton;

public class Loop {
    // 虽然这里是静态（static）属性，但是在构造函数中，实例化的时候都会递归调用构造函数，
    // 导致这个静态属性loop一直没有执行完一次实例化的过程（用递归的角度来看，就是无限调用，不存在最内层返回）
    // 因此 loop没有被成功赋值，导致null判断一直不成功，继而继续递归。。。。直到栈溢出
    // 改成普通成员属性，结果也是栈溢出，但在内在细节有些区别，此时每次执行构造函数都会创建一个新引用loop，而上述static下，只有一个静态的loop引用
    public static Loop loop;
//    public Loop loop;
    public Loop() {
        System.out.println("嘻嘻！");
        if (loop == null)
            loop = new Loop();
        else
            System.out.println("哈哈！");
    }
}
