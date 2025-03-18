package ch06_condition;
/*
    if - else if -else#

    형식 :
    if(조건식) {
    실행문1
    } else if (조건식2) {
    실행문2
    } else if (조건식3) {
    실행문3
    } else {
    실행문4
    }
 */
import java.util.Scanner;

public class Condition04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int point = 0;
        final int VIP_POINT = 80;
        final int GOLD_POINT = 60;
        final int SILVER_POINT = 40;
        final int BRONZE_POINT = 20;
        //2의 추가 부분을 통해 코드
        String mating = "";
        System.out.println("회원 포인트를 입력하세요 >>>");
        point = scanner.nextInt();


        if(point > VIP_POINT) {
            mating = "VIP";
        } else if(point > GOLD_POINT) {
            mating = "GOLD";
        } else if(point > SILVER_POINT) {
            mating = "SILVER";
        } else if(point > BRONZE_POINT) {
            mating = "BRONZE";
        } else {
            mating = "일반";
        }

        System.out.println("당신의 등급은 : " + mating);



    }
}
