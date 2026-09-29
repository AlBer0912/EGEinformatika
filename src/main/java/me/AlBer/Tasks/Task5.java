package me.AlBer.Tasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task5 {

    public static void execute19055() {
        int result = 1000;
        for (int n = 0; n < 1000; n++) {
            StringBuilder nStr = new StringBuilder(Integer.toBinaryString(n));
            for (int t = 0; t < 2; t++) {
                int a = 0;
                for (char c : nStr.toString().toCharArray()) {
                    if (c == '1') {
                        a++;
                    }
                }
                nStr.append(a % 2);
            }
            int r = Integer.parseInt(nStr.toString(), 2);
            if (r > 97) {
                if (r < result) {
                    result = r;
                }
            }
        }
        System.out.println(result);
    }


    public static void execute92248() {
        int result = 0;
        for (int n = 1; n < 1000; n++) {
            String nStr = Integer.toBinaryString(n);
            if (n % 2 == 0) {
                nStr = "1" + nStr + "1";
            } else {
                nStr = "1" + nStr + "10";
            }
            int r = Integer.parseInt(nStr, 2);
            if (r <= 65) {
                if (r > result) {
                    result = r;
                }
            }
        }
        System.out.println(result);
    }


    public static void execute68238() {
        for (int n = 100; n < 1000000; n++) {
            List<Integer> list = new ArrayList<>();
            String nStr = String.valueOf(n);
            for (int i = 0; i < nStr.length() - 2; i++) {
                int t = Integer.parseInt(nStr.substring(i, i + 3));
                list.add(t);
            }
            int r = Collections.max(list) - Collections.min(list);
            if (r == 415) {
                System.out.println(n);
                return;
            }
        }
    }

}
