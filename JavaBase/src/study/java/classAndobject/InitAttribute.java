package study.java.classAndobject;

public class InitAttribute {
    public static void main(String[] args) {
        Test t = new Test();
        System.out.println(t.name);
    }

    static class Test{
        public String name = "the";

        public Test() {
            name = "a";
        }
        {
            name = "an";
        }
    }
}
