package sorting;

/*
    - Divide and conquer algorithm
    - Recursive
    - Two phases: Splitting and Merging
    - Splitting phase leads to a faster sorting during the Merging phase
    - Stable algorithm
    - Not an in-place algorithm, can use a lot of space to create the temp arrays

    - Splitting phase:
    - Start with an unsorted array
    - Divide the array into two arrays, which are unsorted. The first array is the
      left array, and the second array is the right array
    - Split the left and right arrays into two arrays each
    - Keep splitting until all the arrays have only one element each - these are sorted

    - Merging phase:
    - Merge every left/right pair of sibling arrays into a sorted array
    - After the first merge, we'll have a bunch of 2-element sorted arrays
    - Then merge those sorted arrays (left/right siblings) to end up with a bunch of
      4-element sorted arrays
    - Repeat until you have a single sorted array
    - Not in-place. Uses temporary arrays
*/

class MergeSort {
    public static void main(String[] args) {
        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

        print(intArray);
    }

    public static void mergeSort(int[] input, int start, int end) {
        if (end - start < 2) {
            return;
        }

        int mid = (start + end) / 2;


    }

    public static void print(int[] intArray) {
        for (int num : intArray) {
            System.out.println(num);
        }
    }
}