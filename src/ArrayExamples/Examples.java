package ArrayExamples;

import java.util.Arrays;
import java.util.Random;

public class Examples {
    // write a function called shuffle to shuffle cards
    // function to fill an array of integers
    // with random values between 1 and 10 inclusive.
    public static void fill_random(int [] arr){ // arr is the name of the array // arr is a reference type.
        Random rng = new Random();
        rng.setSeed(10);
        for (int i = 0; i < arr.length; i++){
            arr[i] = rng.nextInt(1,11);
        }
    }
    public static void print_array(int [] arr){
        System.out.print('[');
        for (int i = 0; i < arr.length-1; i++)
            System.out.print(arr[i]+",");
        System.out.print(arr[arr.length-1]);
        System.out.println(']');
    }
    public static void print_array2(int [] arr){
        System.out.print('[');
        // enhanced for loop;
        for (int v : arr) {
            System.out.print(v + ",");
        }
        System.out.println(']');
    }
    public static int sum(int[]arr){
        int s = 0;
        for (int v : arr){
            s += v;
        }
        return s;
    }

    public static int sum2(int[] arr){
        int s = 0;
        for (int i = 0; i < arr.length; i++){
            s += arr[i];
        }
        return s;
    }
    public static int sum3(int[] arr){
        int i = 0;
        int s = 0;
        while (i < arr.length){
            s += arr[i++]; // very common idiom. // dont need braces.
            //i++;
        }
        return s;
    }
    // write a function that reverses an array. Modify the actual array passed.
    public static int[] reverse(int[]arr){

        for (int i = 0; i < arr.length/2;i++){
            int temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }
        return arr;
    }
    // return the index of the item in arr. If not found -1
    public static int indexOf(String [] arr, String item){
        for (int i = 0; i < arr.length;i++){
            if (arr[i].equals(item)) {
                return i;
            }
        }
        return -1;
    }
    // returns the value of  largest element in array

    public static int max(final int [] arr){ // final int - function does not change value of array.
        int curr_max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++)
            if (arr[i] > curr_max)
                curr_max = arr[i];
      return curr_max;
    }
    // write a function that returns the average of an array of integers.
    public static double avg(int[] arr){
        return (double) sum(arr) / arr.length;
    }

    public static double median(int[] arr){
        Arrays.sort(arr);
           if (arr.length % 2 == 0){
               return (arr[arr.length/2] + arr[arr.length/2-1]) / 2.0;
           }
           else {
               return arr[arr.length/2];
           }
        }




    public static void main (String [] args){
        int [] nums = {4,1,0,9,2,8}; // int( called base type) brackets variable name = initializer with values.
        System.out.println(max(nums) == 9);
        System.out.println(Arrays.equals(reverse(nums),new int []{8,2,9,0,1,4})); // creating array while print.
        // functions that return values can be composed.
        String [] names = {"Harry", "Hermione", "Ron", "Draco"};
        System.out.println(indexOf(names,"Ron") == 2);
        System.out.println(indexOf(names,"Dumbledore") == -1);

        int [] grades = new int[10]; // allocate space for 10 grades. used when we don't know how many values.
        System.out.println(nums[2]); // access the third number of array. (indexing numbers)

        //System.out.println(nums[-1]); //index out of range error.

        fill_random(grades);
       print_array(grades);
        print_array2(grades);
        System.out.println(sum(grades) == 48);
        System.out.println(sum2(grades) == 48);
        System.out.println(sum3(grades) == 48);
        System.out.println(sum3(grades) == 48);
        System.out.println(avg(grades) == 4.8);
        System.out.println(median(grades) == 4.5);

    }
}
