package com.gospotcheck.blackboard.arrays;

import com.gospotcheck.blackboard.gscobjects.Place;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class BasicArraysTest {

    private BasicArrays basicArrays;
    private Place[] places;
    private Place place1;
    private Place place2;
    private Place place3;
    private Place place4;
    private Place place5;
    private Place place6;
    private Place place7;

    @Before
    public void setup() throws Exception {
        basicArrays = new BasicArrays();

        place1 = new Place().setDistance(12);
        place2 = new Place().setDistance(14);
        place3 = new Place().setDistance(9);
        place4 = new Place().setDistance(32);
        place5 = new Place().setDistance(4);
        place6 = new Place().setDistance(16);
        place7 = new Place().setDistance(14);

        places = new Place[]{place1, place2, place3, place4, place5, place6, place7};
    }

    @Test
    public void addElements_iteratesThroughAnArrayAndReturnsTheAddedElements() throws Exception {
        int[] array = { 54, 232, 585, 101 };

        int addedElements = basicArrays.addElements(array);

        assertThat(addedElements).isEqualTo(972);
    }

    @Test
    public void incrementExample_showsHowToIncrementInside2Loops() throws Exception {
        basicArrays.incrementExample();
        assertThat(basicArrays.getIncrementInAllLoops()).isEqualTo(30);
    }

    @Test
    public void bubbleSort_sortsAnArrayUsingBubbleSort() throws Exception {
        basicArrays.bubbleSort(places);

        assertThatPlacesAreInOrderByDistance();
        assertThat(basicArrays.getIncrementInAllLoops()).isEqualTo(25);
    }

    @Test
    public void selectionSort_sortsAnArrayUsingSelectionSort() throws Exception {
        basicArrays.selectionSort(places);

        assertThatPlacesAreInOrderByDistance();
        assertThat(basicArrays.getIncrementInAllLoops()).isEqualTo(27);
    }

    private void assertThatPlacesAreInOrderByDistance() {
        assertThat(places[0].getDistance()).isEqualTo(place5.getDistance());
        assertThat(places[1].getDistance()).isEqualTo(place3.getDistance());
        assertThat(places[2].getDistance()).isEqualTo(place1.getDistance());
        assertThat(places[3].getDistance()).isEqualTo(place2.getDistance());
        assertThat(places[4].getDistance()).isEqualTo(place7.getDistance());
        assertThat(places[5].getDistance()).isEqualTo(place6.getDistance());
        assertThat(places[6].getDistance()).isEqualTo(place4.getDistance());

        assertThat(place5.getDistance()).isEqualTo(4);
        assertThat(place3.getDistance()).isEqualTo(9);
        assertThat(place1.getDistance()).isEqualTo(12);
        assertThat(place2.getDistance()).isEqualTo(14);
        assertThat(place7.getDistance()).isEqualTo(14);
        assertThat(place6.getDistance()).isEqualTo(16);
        assertThat(place4.getDistance()).isEqualTo(32);
    }
}
