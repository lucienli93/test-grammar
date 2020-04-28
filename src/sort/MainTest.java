package sort;

public class MainTest {

    public static void main(String[] args) {
        int [] parms = new int [] {10, 11, 4, 5, 3, 4, 9, 33, 32};

    }

    public static void quickSort(int [] arr, int start, int end) {
        if (start >= end) {
            return;
        }
        int flagValue = arr[start];
        int s = start + 1;
        int e = end;
        for (; s <= e; s++) {
            if (arr[s] < flagValue) {
                swapElement(arr, s, s - 1);
            }
        }
    }

    private static void swapElement(int [] arr, int e1, int e2) {
        arr[e1] = arr[e1] ^ arr[e2];
        arr[e2] = arr[e1] ^ arr[e2];
        arr[e1] = arr[e1] ^ arr[e2];
    }
}
