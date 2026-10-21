import java.util.List;

class Result {
    /*
     * Complete the 'quickSort' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */
    public static List<Integer> quickSort(List<Integer> arr) {
        // Đề bài yêu cầu pivot luôn ở vị trí đầu tiên
        int pivot = 0;
        int storingIndex = pivot + 1;

        for (int i = pivot + 1; i < arr.size(); ++i) {
            if (arr.get(i) < arr.get(pivot)) {
                // Hoán vị arr[storingIndex] và arr[i]
                int tmp = arr.get(storingIndex);
                arr.set(storingIndex, arr.get(i));
                arr.set(i, tmp);
                ++storingIndex;
            }
        }

        // Đưa pivot về vị trí giao điểm (storingIndex - 1)
        int tmp = arr.get(pivot);
        arr.set(pivot, arr.get(storingIndex - 1));
        arr.set(storingIndex - 1, tmp);

        // Hệ thống yêu cầu trả về mảng kết quả thay vì in ra màn hình[cite: 1]
        return arr;
    }
}