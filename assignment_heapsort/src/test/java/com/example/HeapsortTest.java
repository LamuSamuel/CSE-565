package com.example;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

import java.util.Random;
import java.util.Arrays;

class HeapsortTest {

    @Test
    void testEmptyArray() {
        int[] arr = {};
        Heapsort.heapsort(arr);
        assertArrayEquals(new int[]{}, arr, "Empty array should remain unchanged");
    }

    @Test
    void testAlreadySortedArray() {
        int[] arr = {1, 2, 3, 4, 5};
        Heapsort.heapsort(arr);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr, "Already sorted array should remain unchanged");
    }

    @Test
    void testReverseOrderArray() {
        int[] arr = {5, 4, 3, 2, 1};
        Heapsort.heapsort(arr);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr, "Array in reverse order should be sorted in ascending order");
    }

    @Test
    void testArrayWithDuplicates() {
        int[] arr = {4, 2, 4, 3, 2, 1, 3};
        Heapsort.heapsort(arr);
        assertArrayEquals(new int[]{1, 2, 2, 3, 3, 4, 4}, arr, "Array with duplicates should be sorted in ascending order");
    }

    @Test
    void testSingleElementArray() {
        int[] arr = {42};
        Heapsort.heapsort(arr);
        assertArrayEquals(new int[]{42}, arr, "Single-element array should remain unchanged");
    }

    @Test
    void testLargeArray() {
        int[] arr = {12, 3, 17, 8, 22, 5, 9, 0, 18, 1};
        Heapsort.heapsort(arr);
        assertArrayEquals(new int[]{0, 1, 3, 5, 8, 9, 12, 17, 18, 22}, arr, "Large array should be sorted in ascending order");
    }

    @Test
    void testArrayWithNegativeNumbers() {
        int[] arr = {-5, -1, -3, -2, -4, -6};
        Heapsort.heapsort(arr);
        assertArrayEquals(new int[]{-6, -5, -4, -3, -2, -1}, arr, "Array with negative numbers should be sorted in ascending order");
    }

    @Test
    void testMixedPositiveAndNegativeNumbers() {
        int[] arr = {3, -2, -5, 7, 1, -1, 4, 0};
        Heapsort.heapsort(arr);
        assertArrayEquals(new int[]{-5, -2, -1, 0, 1, 3, 4, 7}, arr, "Array with mixed positive and negative numbers should be sorted in ascending order");
    }
   /// All the test's below are the enhancements which i found are needed to the above cases provided by GPT.
    @Test // enhancement of the function to test TwoElementsInArrray
    void testtTwoElementArray(){
        int[] arr = {77,11};
        Heapsort.heapsort(arr);
        assertArrayEquals(new int[]{11,77}, arr, "Two elements array should be sorted in ascending order");
    }

    @Test // enhancement of the function testLargeArray()
    void testLargeArrayPerformance() {
        int[] arr = new int[10000];
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100000); // Random integers
        }
        int[] expected = Arrays.copyOf(arr, arr.length);
        Arrays.sort(expected);
        Heapsort.heapsort(arr);
        assertArrayEquals(expected, arr, "Large array should be sorted correctly.");
    }
    @Test // this is an enhancement to the function testMixedPositiveAndNegativeNumbers
    void testLargeRangeOfNumbers() {
        int[] arr = {1000000, -1000000, 0, 1, -1, 123456, -654321};
        Heapsort.heapsort(arr);
        assertArrayEquals(new int[]{-1000000, -654321, -1, 0, 1, 123456, 1000000}, arr, "Array with a large range of numbers should be sorted correctly.");
    }
    @Test // this is an enhancement of the previous test generated by chatgpt
    void testForEqualElements(){
        int[] arr = {7, 7, 7, 7, 7};
        Heapsort.heapsort(arr);
        assertArrayEquals(new int[]{7, 7, 7, 7, 7}, arr, "Array with all equal elements should remain unchanged");
    }

}



