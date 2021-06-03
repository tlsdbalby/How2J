package study.java.controllers;

public class Break {
    public static void main(String[] args) {
        int p = 12000;
        double r = 0.2;
        int n = 1;
        int goal = 100000;
        while (true){
            double F = p*Math.pow((1+r), n);
            if (F >= goal)
                //结束当前循环（与break最近的循环）
                break;
            n++;
        }
        System.out.println("按照每年投入"+p+"元，年利率"+r+"，需要"+n+"年才能获得100w");

        //结束多层循环方法1：加一个标识，适用于少量循环，在想跳出的循环加设标识，在每个子循环加一块跳出代码
        for (int i = 0; i < 10; i++) {
            boolean is = false;
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    if (i == 2 && j == 3 && k == 4){
                        is = true;
                        break;
                    }
                }
                if (is)
                    break;
            }
            if (is)
                break;
        }

        //结束多层循环方法2：加标签，类似于goto，跳到标签处
        out:
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    if (i == 2 && j == 3 && k == 4){
                        break out;
                    }
                }
            }
        }
    }
}
