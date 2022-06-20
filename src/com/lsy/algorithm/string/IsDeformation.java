package com.lsy.algorithm.string;

/**
 * 判断两个字符串是否互为变词
 * P 253
 */
public class IsDeformation {

    public static void main(String[] args) {
        String str1 = "121231";
        String str2 = "322111";
        System.out.println(isDeformation(str1, str2));
    }

    public static boolean isDeformation(String str1, String str2) {
        if (str1 == null || str2 == null || str1.length() != str2.length())
            return false;
        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();
        //若字符串长度过多，可用hash表代替
        int[] map = new int[256];
        for (int i = 0; i < chars1.length; i++) {
            map[chars1[i]]++;  // map[chars1[i]] = map[chars1[i]]+1;
        }

        for (int i = 0; i < chars2.length; i++) {
            if (map[chars2[i]]-- == 0)
                return false;
        }
        return true;
    }
}
