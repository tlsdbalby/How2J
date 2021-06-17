package study.java.arrays;

import java.util.Random;

public class Sort {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random rd = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(100);
            System.out.println(arr[i]);
        }
        System.out.println("===================");
        selectSort(arr);
        System.out.println("===================");
        poSort(arr);

    }

    static void selectSort(int[] arr){
        //下个排序还要用arr，所以此处拷贝一下
        int[] re = arr.clone();
        for (int i = 0; i < re.length; i++) {
            int temp = i;
            for (int j = i; j < re.length; j++) {
                if (re[j] > re[temp]){
                    temp = j;
                }
            }
            int t = re[i];
            re[i] = re[temp];
            re[temp] = t;
        }

        for (int i : re) {
            System.out.println(i);
        }
    }

    static void poSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j] < arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
