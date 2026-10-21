package week4;
import java.util.Arrays;
import java.util.Scanner;
class InsertionSort{
    private InsertionSort(){}
    public static void sort(int [] arr){
        for (int i = 1; i < arr.length; ++i){
            int tmp = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] < tmp){
                arr[j + 1] = arr[j];
                j -- ;
            }
            arr[j + 1] = tmp;
        }
    }
}
public class w4_tailop_25021913 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int citation[] = new int[n];
        for (int i = 0; i < n; ++i){
            citation[i] = sc.nextInt();
        }
        InsertionSort.sort(citation);
        int ans =0 ;
        for (int i = 0; i < n; ++i){
            if (citation[i] < i + 1)break;
            ans++;
        }
        System.out.println(ans);
    }
}
