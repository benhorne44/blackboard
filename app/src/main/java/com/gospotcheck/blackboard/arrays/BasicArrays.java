package com.gospotcheck.blackboard.arrays;


public class BasicArrays {

    public int addElements(int[] array) {
        int sum = 0;
        for ( int index = 0; index < array.length ; index++) {
            sum += array[index]; // Identical to - sum = sum + array[index];
        }
        return sum;
    }
}
