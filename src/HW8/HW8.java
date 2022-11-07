package HW8;

import java.util.Arrays;

public class HW8 {
    /*
     *   Return the sum of the array of integers starting at index i up
     *   to the end of the array.  Assume i >= 0.
     *
     *   Write this recursively. Do not use a loop.
     */
    public static int sum(int[] aoi, int i) {
        if (i > aoi.length - 1) {
            return 0; // if given i is out of bounds for length of array then return 0.
        }
        if (i == aoi.length - 1) {
            return aoi[aoi.length - 1]; // base case
        } else {
            return sum(aoi, i + 1) + aoi[i];
        }
    }


    // Swap items at position i and j in aos.
    public static void swap(int[] aos, int i, int j) {
        int temp = aos[i];
        aos[i] = aos[j];
        aos[j] = temp;
    }


    /*
     *   Reverse the array items in aoi between indexes i and j inclusive.
     *
     *   Write this recursively. Do not use a loop.
     */
    public static int[] reverse(int[] aoi, int i, int j) {
        if (i >= j) {
            return aoi; // base case
        } else {
            swap(aoi, i, j); // using previously given function swap
            return reverse(aoi, i + 1, j - 1);

        }

    }


    /*
     *   Count the number of times target appears in aoi starting
     *   at index i.
     *
     *   Write this recursively. Do not use a fruit loop.
     */
    public static int count(int[] aoi, int target, int i) {
        if (i == aoi.length - 1)
            return 0; // base case
        if (i > aoi.length - 1)
            return 0; // if given i is out of bounds for length of array then return 0.
        if (aoi[i] == target)
            return count(aoi, target, i + 1) + 1; // if target is at position i of array, add 1.
        else
            return count(aoi, target, i + 1); // if target is not at position i of array, do not add 1.
    }

    public static void main(String[] args) {
        int[] nums = {4, 9, 1, 3, 2, 2, 9, 2};
        System.out.println(sum(nums, 0) == 32);
        System.out.println(sum(nums, 4) == 15);
        System.out.println(sum(nums, 13) == 0);

        System.out.println(Arrays.equals(
                reverse(nums, 0, nums.length - 1),
                new int[]{2, 9, 2, 2, 3, 1, 9, 4}
        ));

        // Watch-out! nums has been reversed

        System.out.println(Arrays.equals(
                reverse(nums, 2, 5),     // reverse the middle four numbers
                new int[]{2, 9, 1, 3, 2, 2, 9, 4}
        ));

        System.out.println(count(nums, 2, 0) == 3);
        System.out.println(count(nums, 2, 13) == 0);
        System.out.println(count(nums, 2, 4) == 2);

    } // main

}
