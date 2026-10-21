package mylibrary;

public class MyInsertionSort {
    public static void sort(int[] arr){
        if (arr == null || arr.length == 1)return ;
        for (int i = 1; i < arr.length; ++i){
            int j = i - 1;
            int tmp = arr[i];
            while (j >= 0 && arr[j] > tmp){
                arr[j + 1] = arr[j];
                --j;
            }
            arr[j + 1] = tmp;
        }
    }
}
