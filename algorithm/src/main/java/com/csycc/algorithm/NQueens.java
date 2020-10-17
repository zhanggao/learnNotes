package com.csycc.algorithm;

/**
 * N 皇后
 *
 * Created by zg on 2020/8/15.
 */
public class NQueens {

    // Java

    class Solution {
        private int size;
        private int count;

        private void solve(int row, int ld, int rd) {
            if (row == size) {
                count++;
                return;
            }
            int pos = size & (~(row | ld | rd));
            while (pos != 0) {
                int p = pos & (-pos);
                pos -= p; // pos &= pos - 1;
                solve(row | p, (ld | p) << 1, (rd | p) >> 1);
            }
        }

        public int totalNQueens(int n) {
            count = 0;
            size = (1 << n) - 1;
            solve(0, 0, 0);
            return count;
        }
    }
}
