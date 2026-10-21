package week6;
class MyBsearch {
    public static int sort(int key, int[] a){
        int lo = 0;
        int hi = a.length - 1;

        while (lo <= hi) {
            // Tính mid theo cách này để tránh tràn số khi lo và hi rất lớn
            int mid = lo + (hi - lo) / 2;

            if      (key < a[mid]) hi = mid - 1;
            else if (key > a[mid]) lo = mid + 1;
            else return mid;
        }
        return -1;
    }
}
public class Bai1 {
    public static void main(String[] args) {
        // Dãy số ví dụ đã được sắp xếp tăng dần
        int[] a = {1, 2, 4, 7, 9, 15, 23, 45, 50};

        // Số cần tìm
        int key = 15;

        // Gọi hàm tìm kiếm
        int index = MyBsearch.sort(key, a);

        // In ra chỉ số tìm được theo yêu cầu của đề bài
        if (index != -1) {
            System.out.println("Chi so cua " + key + " la: " + index);
        } else {
            System.out.println("Khong tim thay " + key + " trong day.");
        }
    }
}
