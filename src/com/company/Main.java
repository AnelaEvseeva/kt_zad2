package com.company;
import java.util.Arrays;

class Main {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(fillArray()));
    }
    static int[] fillArray() {
        int[] array = new int[8];
        for (int i = 0, j = 0; i < array.length; i++, j += 3)
            array[i] = j;
        return array;
    }
}


