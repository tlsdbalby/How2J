package study.java.classAndobject;

public class PassParameters {
    public static void main(String[] args) {
        String str_1 = "hello";
        String str_2 = "你好";
        String str_3 = "aloha";
        String str = str_1;
        Pass p = new Pass(str);
        str = str_2;
        p.getStr();
    }
    static class Pass{
        String str;
        public Pass(String str) {
            this.str = str;
        }
        public void getStr(){
            System.out.println(str);
        }
    }
}
