package com.mphasis;

public class QuickSortEg {

    public static void main(String[] args) {
        int arr[] = {10, 23, 45, 12, 65, 87, 44, 9, 98};

        System.out.println("before sorting");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");

        quickSort(arr, 0, arr.length - 1);

        System.out.println();
        System.out.println("after sorting");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivot = partition(arr, low, high);

            // recurse on left and right parts
            quickSort(arr, low, pivot - 1);
            quickSort(arr, pivot + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low;
        int j = high;

        while (i < j) {
            while (i <= high && arr[i] <= pivot) {
                i++;
            }
            while (j >= low && arr[j] > pivot) {
                j--;
            }
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // place pivot in correct position
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;

        return j;
    }
}
















