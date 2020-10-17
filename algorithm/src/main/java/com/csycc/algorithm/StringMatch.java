package com.csycc.algorithm;

/**
 * 字符串匹配
 *
 * Created by zg on 2020/8/15.
 */
public class StringMatch {

    // Java
    public static int forceSearch(String txt, String pat) {
        int M = txt.length();
        int N = pat.length();

        for (int i = 0; i <= M - N; i++) {
            int j;
            for (j = 0; j < N; j++) {
                if (txt.charAt(i + j) != pat.charAt(j))
                    break;
            }
            if (j == N) {
                return i;
            }
            // 更加聪明？
            // 1. 预先判断 hash(txt.substring(i, M)) == hash(pat)
            // 2. KMP
        }
        return -1;
    }

}
