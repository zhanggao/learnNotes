package com.csycc.algorithm;

/**
 * 子串查找
 *
 * Created by zg on 2020/8/15.
 */
public class RabinKarp {

    public final static int D = 256;
    public final static int Q = 9997;

    static int RabinKarpSerach(String txt, String pat) {
        int M = pat.length();
        int N = txt.length();
        int i, j;
        int patHash = 0, txtHash = 0;

        for (i = 0; i < M; i++) {
            patHash = (D * patHash + pat.charAt(i)) % Q;
            txtHash = (D * txtHash + txt.charAt(i)) % Q;
        }
        int highestPow = 1;  // pow(256, M-1)
        for (i = 0; i < M - 1; i++)
            highestPow = (highestPow * D) % Q;

        for (i = 0; i <= N - M; i++) { // 枚举起点
            if (patHash == txtHash) {
                for (j = 0; j < M; j++) {
                    if (txt.charAt(i + j) != pat.charAt(j))
                        break;
                }
                if (j == M)
                    return i;
            }
            if (i < N - M) {
                txtHash = (D * (txtHash - txt.charAt(i) * highestPow) + txt.charAt(i + M)) % Q;
                if (txtHash < 0)
                    txtHash += Q;
            }
        }

        return -1;
    }
}
