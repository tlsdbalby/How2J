package study.java.controllers;

public class Practice {
    public static void main(String[] args) {
        System.out.println(getGoldNumber(20));
        System.out.println(getWaterNumber());
        System.out.println(getMagicNumber());
    }

    public static String getGoldNumber(int range){
        double des = 20;
        double n1 = 0, n2 =0;
        for (double i = 1; i <= range; i++) {
            for (double j = 1; j <= range; j++) {
                double t = Math.abs(i/j - 0.618);
                if (t < des){
                    des = t;
                    n1 = i;
                    n2 = j;
                }
            }
        }
        return range+"以内，与黄金分割数最相近的组合:分子"+n1+" 分母:"+n2+" n1/n2="+(n1/n2);
    }

    static String getWaterNumber(){
        int i = 100;
        String re = "";
        while (i < 1000){
            int t = i;
            int n1 = t%10;
            int n2 = t%100 / 10;
            int n3 = t/100;
            if (Math.abs(Math.pow(n1, 3)+Math.pow(n2, 3)+Math.pow(n3, 3) - i) < 0.0001)
                re += i+"|";
            i++;
        }
        return re;
    }

    static String getMagicNumber(){
        for (int i = 0; i < 14; i++) {
            for (int j = 0; j < 10; j++) {
                if (i + j == 8){
                    for (int k = 0; k < 14; k++) {
                        if (i + k == 14){
                            for (int l = 0; l < 10; l++) {
                                if (k - l == 6 && j + l == 10)
                                    return "i="+i+" j="+j+" k="+k+" l="+l;
                            }
                        }
                    }
                }
            }
        }
        return "";
    }
}
