package com.gospotcheck.blackboard.arrays;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class BasicArraysTest {

    BasicArrays basicArrays;

    @Before
    public void setup() throws Exception {
        basicArrays = new BasicArrays();
    }

    @Test
    public void addElements_iteratesThroughAnArrayAndReturnsTheAddedElements() throws Exception {
        int[] array = { 54, 232, 585, 101 };

        int addedElements = basicArrays.addElements(array);

        assertThat(addedElements).isEqualTo(972);
    }
}
