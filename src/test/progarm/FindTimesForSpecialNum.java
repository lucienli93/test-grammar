package test.progarm;

public class FindTimesForSpecialNum {

    public static void main(String[] args) {
        FindTimesForSpecialNum test = new FindTimesForSpecialNum();
        int [] arr = new int [] {4, 4};
        System.out.println(test.getTimesForSpecialNum(arr, 4));
    }

    public int getTimesForSpecialNum(int [] arr, int number) {
        if (arr == null || arr.length < 1) {
            return 0;
        }
        if (arr.length == 1) {
            if (number == arr[0]) {
                return 1;
            } else {
                return 0;
            }
        }
        return getContainNumArr(arr, number, 0, arr.length - 1);
    }

    private int getContainNumArr(int [] arr, int number, int start, int end) {
        if (start >= end) {
            return (arr[end] == number ? 1 : 0);
        }
        int mid = (start + end) / 2;
        if (arr[mid] == number) {
            int startIndex = getStartIndex(arr, number, start, mid);
            int endIndex = getEndIndex(arr, number, mid, end);
            return endIndex - startIndex + 1;
        } else if (arr[mid] > number) {
            return getContainNumArr(arr, number, start, mid - 1);
        } else {
            return getContainNumArr(arr, number, mid + 1, end);
        }
    }

    private int getStartIndex(int [] arr, int number, int start, int end) {
        if (start >= end) {
            return start;
        }
        int mid = (start + end) / 2;
        if (arr[mid] != number) {
            return getStartIndex(arr, number, mid + 1, end);
        }
        if ((mid > 0 && arr[mid - 1] != number) || 
                mid == 0) {
            return mid;
        } else {
            return getStartIndex(arr, number, start, mid - 1);
        }
    }

    private int getEndIndex(int [] arr, int number, int start, int end) {
        if (start >= end) {
            return start;
        }
        int mid = (start + end) / 2;
        if (arr[mid] != number) {
            return getEndIndex(arr, number, start, mid - 1);
        }
        if ((mid < arr.length - 1 && arr[mid + 1] != number) ||
                mid == arr.length - 1) {
            return mid;
        } else {
            return getEndIndex(arr, number, mid + 1, end);
        }
    }
}
