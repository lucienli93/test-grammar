package test.progarm;

public class BitMapTest {

    public static void main(String[] args) {
        int [] arr = new int [] {1, 1, 2, 3, 4, 33, 33, 16};
        BitMapTest bitMapTest = new BitMapTest();
        int [] result = bitMapTest.getExitsNumArr(arr);
        bitMapTest.printNumber(result);
    }
    
    public int[] getExitsNumArr(int [] data) {
        int [] bitArr = new int[Integer.MAX_VALUE >> 4];
        for (int i = 0; i < data.length; i++) {
            int temp = data[i];
            int mod = temp % 16;
            mod = mod > 0 ? 15 - mod : mod;
            int bitValue = 1 << (mod * 2);
            int bitArrIndex = getBucketIndex(temp);
            if ((bitArr[bitArrIndex] & bitValue) == 0) {
                bitArr[bitArrIndex] = (bitArr[bitArrIndex] | bitValue);
            } else {
                bitArr[bitArrIndex] = (bitArr[bitArrIndex] | (bitValue << 1));
            }
        }
        return bitArr;
    }
    
    private int getBucketIndex(int num) {
        return num >> 4;
    }
    
    private int getOriginValue(int bucketIndex, int bitIndex) {
        int result = -1;
        bitIndex = bitIndex > 0 ? (15 - (bitIndex >> 1)) : bitIndex;
        result = (bucketIndex << 4) + bitIndex;
        return result;
    }
    
    private void printNumber(int [] bitArr) {
        for (int i = 0; i < bitArr.length; i++) {
            for (int j = 30; j >= 0; j -= 2) {
                int filter = 2 << j;
                int currentValue = (bitArr[i] & filter);
                if (currentValue != 0) {
                    System.out.println(getOriginValue(i, j));
                }
            }
        }
    }
}
