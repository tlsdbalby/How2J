package study.java.operators;

import java.util.Scanner;

public class RelationOper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("关系操作符示例\n请输入两个数字：");
        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        System.out.println(n1+">"+n2+":"+(n1>n2));
        System.out.println(n1+"="+n2+":"+(n1==n2));
        System.out.println(n1+"<"+n2+":"+(n1<n2));
        System.out.println(n1+"!="+n2+":"+(n1!=n2));
        System.out.println(n1+">="+n2+":"+(n1>=n2));
        System.out.println(n1+"<="+n2+":"+(n1<=n2));

    }
}
