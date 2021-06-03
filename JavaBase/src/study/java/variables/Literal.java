package study.java.variables;

public class Literal {
    public static void main(String[] args) {
        //整数的字面量形式：整数可以用怎样的形式表达:进制表达和类型表达
        int byVal = 0b10101;//二进制,起始标识:0b
        int oxVal = 033;//八进制,起始标识:0
        int hexVal = 0x1a;//十六进制,起始标识:0x
        int decVal = 26;//十进制，默认，无起始标识
        long val = 26L;//long类型的十进制,结尾标识:L(任意进制加L都可以转为long类型)

        //浮点数的字面量形式:类型和科学记数法
        float f = 3.145F;//float类型的十进制浮点数,结尾标识:F
        double d1 = 3.145;//double类型的浮点数,默认
        double d2 = 3.145e-2;//科学记数法double类型的十进制浮点数
    }
}
