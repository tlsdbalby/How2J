package study.java.controllers;

public class Continue {
    public static void main(String[] args) {
        int i = 0;
        do {
            i++;
            if (i % 3 == 0 || i % 5 == 0)
                continue;
            System.out.println(i);
        } while (i < 100);
    }
}
