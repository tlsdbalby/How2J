package study.java.operators;

import java.util.Scanner;

public class NumberOper {
    public static void main(String[] args) {
        //一些有意思的运算符例子
        int i = 0;
        i = i++;
        System.out.println(i);//i的结果永远为0,执行顺序:i++等价于[temp = i, i = i + 1], i = temp
                              //虽然i++是先用后加，但也是个原子操作，通过临时变量保持原值并使用，然后对i进行自增
        i = ++i;
        System.out.println(i);//先加再用，则正常变化

        i = 1;
        int j = ++i + i++ + ++i + ++i + i++;//2 + 2 + 4 + 5 + 5
        System.out.println(j);

        Scanner sc = new Scanner(System.in);
        System.out.println("计算BMI");
        System.out.println("请输入您的体重（Kg）与身高（m）：");
        double weight = sc.nextDouble();
        double height =sc.nextDouble();
        System.out.println("您的BMI是："+weight/(height*height));
    }
}
