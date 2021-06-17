package study.java.arrays;

import java.util.Random;

public class Copy {
    public static void main(String[] args) {
        Random rd = new Random();
        int[] arr1 = new int[rd.nextInt(5)+5];
        int[] arr2 = new int[rd.nextInt(5)+5];
        int l1 = arr1.length;
        int l2 = arr2.length;
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = rd.nextInt(15);
        }
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = rd.nextInt(15);
        }

        int[] arr3 = new int[l1+l2];
        System.arraycopy(arr1, 0, arr3, 0, l1);
        System.arraycopy(arr2, 0, arr3, l1, l2);

        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
        System.out.println("==========");
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
        System.out.println("==========");
        for (int i = 0; i < arr3.length; i++) {
            System.out.println(arr3[i]);
        }
    }
}
