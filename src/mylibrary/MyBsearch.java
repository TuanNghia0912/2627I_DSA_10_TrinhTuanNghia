package mylibrary;

public class MyBsearch {
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
