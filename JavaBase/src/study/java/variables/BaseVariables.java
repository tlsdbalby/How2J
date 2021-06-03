package study.java.variables;

public class BaseVariables {
    public static void main(String[] args) {
        //8种基本数据类型，前七个的单位是字节B=8位
        byte bytes = 1;
        short shorts = 2;
        int ints = 4;
        long longs = 8;

        float floats = 4;
        //小数默认是double类型，想要用float类型需要在结尾加f
        floats = 3.14F;
        double doubles = 8;
        doubles = 3.14;

        char chars = 2;
        chars = 'a';

        //布尔类型的单位是位，占据一位
        boolean booleans = true;
    }
}
