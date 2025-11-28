package com.mphasis;
public class MergeSortExample {

    public static void main(String[] args) {
        int arr[] = {10, 23, 45, 12, 65, 87, 44, 9, 98};
        int n = arr.length - 1;
        
        System.out.println("before sorting");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
       
        mergeSort(arr, 0, n);
        System.out.println( );
        System.out.println("after sorting");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            // Sort left half
            mergeSort(arr, left, mid);

            // Sort right half
            mergeSort(arr, mid + 1, right);

            // Merge the two halves
            merge(arr, left, mid, right);
        }
    }

    public static void merge(int[] arr, int left, int mid, int right) {
        int ll = mid - left + 1;   // length of left subarray
        int rl = right - mid;      // length of right subarray

        int larr[] = new int[ll];
        int rarr[] = new int[rl];

        // Copy data into temp arrays
        for (int i = 0; i < ll; i++)
            larr[i] = arr[left + i];

        for (int j = 0; j < rl; j++)
            rarr[j] = arr[mid + 1 + j];

        // Merge temp arrays back into arr[left..right]
        int i = 0, j = 0;
        int k = left;   // IMPORTANT: start from 'left'

        while (i < ll && j < rl) {
            if (larr[i] <= rarr[j]) {
                arr[k++] = larr[i++];
            } else {
                arr[k++] = rarr[j++];
            }
        }

        // Copy remaining elements of larr[]
        while (i < ll) {
            arr[k++] = larr[i++];
        }

        // Copy remaining elements of rarr[]
        while (j < rl) {
            arr[k++] = rarr[j++];
        }
    }
}
