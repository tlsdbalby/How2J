package study.java.controllers;

public class For {
    public static void main(String[] args) {
        int i = 1;
        while (i < 15){
            System.out.println("乞丐得到："+(int)Math.pow(2, i++)+"块钱");
        }
    }
}
