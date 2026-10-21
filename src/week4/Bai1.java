package week4;
import mylibrary.MyInsertionSort;
import edu.princeton.cs.algs4.*;
import java.util.*;
import mylibrary.MyInsertionSort;


public class Bai1 {

    public static void main(String[] args) {
        In in = new In("D:\\hoc tap\\dsa\\2627I_DSA_10_TrinhTuanNghia\\algs4-data\\16Kints.txt"); // tạo luồng đọc từ file
        int[] a = in.readAllInts();  // đọc toàn bộ file vào mảng a
        long start = System.currentTimeMillis();
        Arrays.sort(a);
        // xử lý dữ liệu trong mảng a
        long end = System.currentTimeMillis() ;  // thời gian chạy bằng end - start
        System.out.println(end - start);
        StdArrayIO.print(a); // in mảng ra màn hình
    }

}
