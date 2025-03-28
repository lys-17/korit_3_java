package ch12_arrays;

import java.util.Arrays;

public class Array14 {

    public static void main(String[] args) {
        int[][] nums = new int[5][20];
        int number = 0;

        //1부터 10까지의 숫자를 nums배열에 순서대로 넣으시오
        /*
      [
                [1,2,3,4,5],
                [6,7,8,9,10],
                [11,12,13,14,15],
                [16,17,18,19,20],
                [21,22,23,24,25],
                [26,27 ...],
                ...
                [..., 100]
            ]
         */


        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; i < nums[i].length; i++) {
                nums[i][j] = ++number;         // 대입 전에 +1 시키고 대입하니까 1부터
            }
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; i < nums[i].length; i++) {
                System.out.println(nums[i][j] + " / ");
            }
            System.out.println();       // 별찍기 때 사용한 실행문3
        }

        //2차 배열의 출력 = Arrays.deepToString(배열명)
        //Arrays.toString()이 안먹힌다는 것을 확인
        System.out.println(Arrays.deepToString(nums));

    }
}
