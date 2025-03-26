package ch12_arrays;

import java.util.Arrays;
import java.util.Random;

/*
    1차 배열을 기준으로
    1 ~ 45까지의 임의의 숫자를 뽑아 배열에 대입

    목표는 1차 배열 내에 6개의 임의의 int값을 집어넣는 것
    근데, 중복이 있으면 안됨 -> 같이

    그래서 복습을 한다고 가정하고 1~45까지의 숫자를 여섯개짜리의 반 배열에 집어넣는 것부터 시작

    LottoNumbers 에 1~45까지의 숫자 중 6개를 뽑아 대입하는 반복문 작건
    - > 1차 배열 하나가 완성됨

    그 1차 배열이 10번 반복되게끔 반복문 작성
    -> 그럼 전체적으로 2중 for문이 됨
 */
public class Array15LottoGame {
    public static <LottoNumber> void main(String[] args) {
        // 객체 생성
        Random random = new Random();
        // 생각해 봐야할 점
        // Math.random()을 사용해서 1~45까지의 범위를 만들려면 어떡해야 함
        // 1 ~ 45
        // (Math.random() * 45) + 1;    --->6번 대입

        // 빈 배열 선언
        int[] LottoNumbers = new int[6];
        //게임횟수
        int round = 5;      //얘를 이용하여 게임 횟수를 5번 반복하시오

        //배열에 난수를 대입하기 위한 for문 작성
        for(int i = 0; i < LottoNumbers.length; i++) {
            LottoNumbers[i] = (int) (Math.random() * 45) + 1;
        }
        Arrays.sort(LottoNumbers);
        System.out.println(Arrays.toString(LottoNumbers));
    }
}




// 나중에 lottoNumbers 다시 체크