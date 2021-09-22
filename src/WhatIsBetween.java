import java.util.Arrays;

public class WhatIsBetween {
    public static int[] between(int a, int b) {
        int[] arr = new int[b - a + 1];
        while (a<=b){
            arr[b-a]=b--;
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(between(1, 4)));
        System.out.println(Arrays.toString(between(-2, 2)));
    }
}
