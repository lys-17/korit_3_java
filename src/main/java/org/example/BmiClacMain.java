package org.example;

import java.util.Scanner;

/*
    BMI 계산기를 작성하시오.

    1. 사용자에게 키(cm)와 몸무게(kg)를 입력 받으시오
    2. 수학적 연산을 통해서 BMI 지수를 산출하시오
        BMI 지수 = 몸무게(kg) / 키(cm의 제곱)
    3. 18.5 미만인 경우 저체중
       23 미만은 정상 체중
       25 미만은 과체중
       25 이상에 해당하는 조건문을 작성하고
    4. 실행 예
       키(cm)를 입력하시오 >>>172
       몸무게(kg)를 입력하시오 >>>70
       당신의 BMI 지수는 23.432314이며 , 과체중입니다.

 */
public class BmiClacMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double height = 0;
        double weight = 0;
        String status = "";


        double bmi = 0;
        System.out.println("키(cm)를 입력하시오 >>>");
        height = 172;
        height = height / 100;
        System.out.println("몸무게(kg)를 입력하시오 >>>");
        weight = scanner.nextDouble();

        bmi = weight / (height * height);
        System.out.println(bmi);

        if(bmi < 18.5 ) {
            status = "저체중";
        } else if (bmi < 23 ) {
            status = "정상체중";
        } else if (bmi < 25 ) {
            status ="과체중";
        } else if (bmi > 25 ) {
            status ="비만";
        }


        System.out.println("당신의 BMI 지수는" + bmi + "이며, " + status + "입니다");
    }
}