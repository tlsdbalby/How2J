package study.java.variables;

public class variablesTransform {
    public static void main(String[] args) {
        byte b1 = 63;
        int i1 = 64;
        long l1 = 500L;

        //大转小合法，小转大强制
        i1 = b1;
        b1 = (byte) i1;

        //小类型加大类型默认变大类型
        i1 = i1 + b1;//byte+int --> int
        b1 = (byte) (i1 + b1);//byte+int --> int
        i1 = (int) (i1 + l1);//int+long --> long

        //特例:byte+byte --> int
        b1 = (byte) (b1 + b1);
        //int+int --> int不变
        i1 = i1 + i1;
        //不变
        l1 = l1 + l1;

    }
}
