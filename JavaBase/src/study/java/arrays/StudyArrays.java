package study.java.arrays;

import java.util.Arrays;
import java.util.Random;

public class StudyArrays {
    public static void main(String[] args) {
        arraysCopy();
        System.out.println("=================");
        arraysToString();
        System.out.println("=================");
        arraysSort();
        System.out.println("=================");
        arraysBinarySearch();
        System.out.println("=================");
        ArraysEqual();
        System.out.println("=================");
        ArraysFill();
        System.out.println("=================");
        ArraysTDArraySort();
    }

    static void arraysCopy(){
        //数组作为引用类型，是一个对象，所以在复制的时候必须创建新空间，否则会导致多个引用指向同一个地址，一改全改
        int[] a = {18, 57, 24, 54, 89, 23, 54};
        //使用Arrays.copyOfRange(源数组, int from, int to)方法
        //需要注意的是 copyOfRange 的第3个参数，表示源数组的结束位置，是取不到的。
        int[] b = Arrays.copyOfRange(a, 0, 4);
        for (int i : b) {
            System.out.println(i);
        }
    }

    static void arraysToString(){
        int[] a = {18, 57, 24, 54, 89, 23, 54};
        String aStr = Arrays.toString(a);
        System.out.println(aStr);
    }

    static void arraysSort(){
        int[] a = {18, 57, 24, 54, 89, 23, 54};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
    }
    static void arraysBinarySearch(){
        int[] a = {18, 57, 24, 54, 89, 23, 54};
        Arrays.sort(a);
        int index = Arrays.binarySearch(a, 23);
        System.out.println("23在数组中的位置是：第"+index+"个元素");
    }

    static void ArraysEqual(){
        int a[] = new int[] { 18, 62, 68, 82, 65, 9 };
        int b[] = new int[] { 18, 62, 68, 82, 65, 8 };

        boolean isEqual = Arrays.equals(a, b);
        System.out.println("a数组与b数组相等："+isEqual);
    }

    static void ArraysFill(){
        int[] a = new int[10];
        Arrays.fill(a, 7);
        System.out.println(Arrays.toString(a));
    }

    static void ArraysTDArraySort(){
        int[][] a = new int[5][8];
        Random rd = new Random();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = rd.nextInt(100);
            }
        }
        System.out.println("二维数组排序前：");
        for (int i = 0; i < a.length; i++) {
            System.out.println(Arrays.toString(a[i]));
        }
        //二维数组排序
        int[] temp = new int[5*8];
        for (int i = 0; i < a.length; i++) {
            System.arraycopy(a[i], 0, temp, 0+i*a[i].length, a[i].length);
        }
//        System.out.println(Arrays.toString(temp));
        Arrays.sort(temp);
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = temp[index++];
            }
        }
        System.out.println("二维数组排序后：");
        for (int i = 0; i < a.length; i++) {
            System.out.println(Arrays.toString(a[i]));
        }
    }
}
