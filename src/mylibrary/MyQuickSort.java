package mylibrary;

public class MyQuickSort {
    public static void sort(int[] a, int low, int high){
        if (low >= high)return;

        int pivot = low;
        int storingIndex=  pivot + 1;
        for (int i = pivot + 1; i <= high; ++i){
            if (a[i] < a[pivot]) {
                int tmp = a[storingIndex];
                a[storingIndex] = a[i];
                a[i] = tmp;
                ++storingIndex;
            }
        }
        int tmp = a[pivot];
        a[pivot] = a[storingIndex - 1];
        a[storingIndex - 1] = tmp;

        sort(a, low, storingIndex - 2);
        sort(a, storingIndex, high);
    }
}
