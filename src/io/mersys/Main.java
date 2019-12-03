package io.mersys;

import org.junit.Test;

public class Main {

    public static void main(String[] args) {


        String s = new String("abs");
        String s2 = new String("abs");
        System.out.print(s == s2);

        int[][] aaa = {
                {0, 0, 1, 0, 0},
                {0, 1, 1, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 1, 0, 0},
        };
    }

    @Test
    public void test() {
        int[][] aaa = {
                {1, 1, 1, 0, 0},
                {1, 1, 1, 1, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 1, 0, 0},
        };
        for (int i = 0; i < aaa.length; i++) {
            for (int i1 = 0; i1 < aaa[i].length; i1++) {
                System.out.print(aaa[i][i1] + " ");
            }
            System.out.println();
        }

        System.out.println();
        int[][] bbb = play(aaa);

        for (int i = 0; i < bbb.length; i++) {
            for (int i1 = 0; i1 < bbb[i].length; i1++) {
                System.out.print(bbb[i][i1] + " ");
            }
            System.out.println();
        }

    }

    public int[][] play(int[][] a) {
        int[][] b = new int[a.length][a[0].length];
        int m = a.length;
        int n = a[0].length;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {

                int N = 0;
                for (int r = i - 1; r <= i + 1; r++) {
                    for (int c = j - 1; c <= j + 1; c++) {
                        if (!(r == i && c == j)) {
                            N += check(a, r, c, m, n);
                        }
                    }
                }

                if (a[i][j] == 1 && N < 3) {
                    b[i][j] = 0;
                } else if (a[i][j] == 1 && N >= 3) {
                    b[i][j] = 1;
                } else if (a[i][j] == 0 && N >= 3) {
                    b[i][j] = 1;
                } else {
                    b[i][j] = 0;
                }
            }
        }


        return b;
    }

    private int check(int[][] a, int i, int j, int rows, int cols) {
        if (i < 0 || i >= rows
                || j < 0 || j >= cols) {
            return 0;
        }
        return a[i][j];
    }
}
