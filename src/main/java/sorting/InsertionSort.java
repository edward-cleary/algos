package sorting;

public class InsertionSort {
/*
    - In-place algorithm
    - O(n2) time complexity - quadratic
    - It will take 100 steps to sort 10 items, 10,000 steps to sort 100 items, 1,000,000 steps to sort 1000 items
    - Stable algorithm
*/
    public static void main(String[] args) {
        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

        for (int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length; firstUnsortedIndex++) {
            int newElement = intArray[firstUnsortedIndex];

            int i;

            for (i = firstUnsortedIndex; i > 0 && intArray[i - 1]  > newElement; i--) {
                intArray[i] = intArray[i - 1];
            }

            intArray[i] = newElement;
        }

        print(intArray);
    }

    public static void print(int[] intArray) {
        for (int num : intArray) {
            System.out.println(num);
        }
    }
}
