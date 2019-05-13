package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class CounterpartTable {
    public static void main(String [] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println((int)(Math.random() * 9));
        }
        List<String> codes = new ArrayList<>(Arrays.asList("001"));
        generateCounterpartTable(codes, 4);
    }
    
    public static void generateCounterpartTable(List<String> codes, int ranks) {
        List<String> codeList = new LinkedList<String>();
        int length = codes.size();
        for (int i = 0; i < length; i++) {
            int index = (int)(Math.random() * codes.size());
            codeList.add(codes.get(index));
            codes.remove(index);
        }
        if (length % 2 == 1) {
            length += 1;
            codeList.add("");
        }
        for (int j = 0; j < ranks; j++) {
            StringBuffer result = new StringBuffer();
            for (int k = 0; k < length / 2; k++) {
                boolean proIsFirst = (int)(Math.random() * 2) > 0;
                result.append(proIsFirst ? codeList.get(k) : codeList.get(length - k -1));
                result.append("<-->");
                result.append(proIsFirst ? codeList.get(length - k -1) : codeList.get(k));
                result.append(";  ");
            }
            String tempValue = codeList.get(1);
            for (int s = length - 2; s > 1; s--) {
                if (s == length - 2) {
                    codeList.set(1, codeList.get(s + 1));
                }
                codeList.set(s + 1, codeList.get(s));
                if (s == 2) {
                    codeList.set(s, tempValue);
                    continue;
                }
            }
            System.out.println(result);
        }
    }
}
