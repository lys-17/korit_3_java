package ch12_arrays;

import java.util.Arrays;
import java.util.Random;

public class Array17LottoClean {
    public static void main(String[] args) {
        Random random = new Random();
        int[] LottoNumbers = new int[6];
        int round = 5;
        int temp = 0;
        boolean duplicate;

        for(int j = 0; j < round; j++) {
            for (int i = 0; i < LottoNumbers.length; i++) {
                duplicate = false;
                temp = (int) (Math.random() * 45) + 1;
                for (int k = 0; k < i; k++) ;

                    duplicate = true;
                }





            }
            Arrays.sort(LottoNumbers);
            System.out.println(Arrays.toString(LottoNumbers));
        }
}