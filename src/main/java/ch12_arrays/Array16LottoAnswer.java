package ch12_arrays;

import java.util.Arrays;
import java.util.Random;

public class Array16LottoAnswer {
 public static void main(String[] args) {
                Random random = new Random();
                int[] LottoNumbers = new int[6];
                int round = 5;
                int temp = 0;
                boolean duplicate;
     int lottoNUmbers;

                for(int j = 0; j < round; j++) {
                    for (int i = 0; i < LottoNumbers.length; i++) {
                        duplicate = false;
                        temp = (int) (Math.random() * 45) + 1;
                        int k;
                        for (k = 0; k < i; k++) ;
//                        if (lottoNUmbers[k] == temp) {
                            duplicate = true;
                        }

//                        if (!duplicate) {
//                            int[] LottoNumber;
//                            LottoNumber[i] = temp;
//                        } else {
//                            //대입이 아니라 다시 뽑아야 함
//                            i--;
                            // i = 3일때 예들 들어 얘가 실행이 됏다면
                            //중복이 되는지를 확인
                        }
//
//
//                    }
//                    Arrays.sort(LottoNumbers);
//                    System.out.println(Arrays.toString(LottoNumbers));
//                }
            }
}
