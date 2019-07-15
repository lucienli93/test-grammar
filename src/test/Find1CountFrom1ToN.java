package test;

public class Find1CountFrom1ToN {

    public static void main(String [] args) {
        int testData = 99;
        long start1 = System.currentTimeMillis();
        int result = find1(testData);
        System.out.println("start1 time: " + (System.currentTimeMillis() - start1) + "<----->" + result);
        long start2 = System.currentTimeMillis();
        result = find1Best(testData);
        System.out.println("start2 time: " + (System.currentTimeMillis() - start2) + "<----->" + result);
    }
    
    public static int find1(int n) {
        int count = 0;
        if (n < 1) {
            return count;
        }
        
        for (int i = 1; i <= n; i++) {
            int temp = i;
            while (temp != 0) {
                if ((temp % 10) == 1) {
//                    System.out.println(temp);
                    count++;
                }
                temp /= 10;
            }
        }
        
        return count;
    }
    
    public static int find1Best(int n) {
        int count = 0;
        if (n < 1) {
            return count;
        } 
        if (n < 10) {
            return 1;
        }
        int [] arr = new int [String.valueOf(n).length() - 1];
        arr[0] = 1;
        int level = 10;
        for (int i = 1; i < arr.length; i++) {
            arr[i] = level;
            for (int j = 0; j < i; j++) {
                arr[i] += 9 * arr[j]; 
            }
            level *= 10;
        }
        
        int index = 0;
        count = n % 10 > 0 ? 1 : 0;
        int tempN = n / 10;
        level = 10;
        while (tempN != 0) {
            int mod = tempN % 10;
            if (mod > 1) {
                count += level;
            } else if (mod == 1) {
                count += (n % (level * 10)) - (level -1);
            }
            for (int i = 0; i <= index; i++) {
                count += mod * arr[i];
            }
            tempN = tempN / 10;
            level *= 10;
            index++;
        }
        return count;
    }
}
