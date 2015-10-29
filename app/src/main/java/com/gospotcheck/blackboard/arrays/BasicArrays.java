package com.gospotcheck.blackboard.arrays;


import com.gospotcheck.blackboard.gscobjects.Place;

public class BasicArrays {

    private int incrementInAllForLoops;

    public BasicArrays() {
        incrementInAllForLoops = 0;
    }

    public int getIncrementInAllForLoops(){
        return incrementInAllForLoops;
    }

    /* The basic for loop
     * for( A ; B ; C )
     * A - Runs once, before anything else, typically declares a variable
     * B - Condition, runs every iteration before entering the code block if it should run
     * C - Runs every iteration AFTER the code block has been executed
     * So in order - A, B, block, C, B, block, C, B, block C, B (if false breaks out)
     */

    public int addElements(int[] array) {
        int sum = 0;
        for ( int index = 0; index < array.length ; index++) {
            sum += array[index]; // Identical to - sum = sum + array[index];
        }
        return sum;
    }

    private void nonAccessableMethod() {
        System.out.println("Sadface... Unless this class calls this method it will never be used.");
    }

    public void incrementExample() {
        for(int i = 0; i < 5; i++) {
            incrementInAllForLoops++;
            for (int n = 0; n < 5; n++) {
                incrementInAllForLoops++;
            }
        }
    }

    public void bubbleSort(Place[] places) {
        for(int out = places.length - 1; out > 1; out--) {
            incrementInAllForLoops++;
            for ( int in = 0; in < out; in++) {
                incrementInAllForLoops++;
                if (places[in].getDistance() > places[in+1].getDistance() ) {
                    swap(places, in, in+1);
                }
            }
        }
    }

    public void selectionSort(Place[] places) {
        for(int out = 0; out < places.length - 1; out++) {
            incrementInAllForLoops++;
            int min = out;
            for(int in = out + 1; in < places.length; in++) {
                incrementInAllForLoops++;
                if (places[in].getDistance() < places[min].getDistance()) {
                    min = in;
                }
            }
            swap(places, out, min);
        }
    }

    private void swap(Place[] places, int one, int two) {
        Place tempPlace = places[one];
        places[one] = places[two];
        places[two] = tempPlace;
    }
}
