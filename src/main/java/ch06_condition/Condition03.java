package ch06_condition;

import java.util.Scanner;

/*
    if-else if문 : if - else문과 달리 else if 에는 별도의 조건문이 요구됨

    형식 :
    if(조건식1)  {
    실행문1
    } else if (조건식2) {
    실행문2
    } else if(조건식3) {
    실행문3
    }
 */
public class Condition03 {
    public static void main(String[] args) {
        //1. scanner 클래스 import
        Scanner scanner = new Scanner(System.in);

        // 2. 변수 및 상수의 선언 및 초기화
        int point = 0;
        final int VIP_POINT = 80;
        final int GOLD_POINT = 60;
        final int SILVER_POINT = 40;
        final int BRONZE_POINT = 20;
        //2의 추가 부분을 통해 코드
        String rating = "";
//
//
        System.out.println("회원 포인트를 입력하세요 >>>");
        point = scanner.nextInt();
//
////        if(point > 80) {
////            System.out.println("회원의 등급 : VIP");
////        } else if(point > 60) {
////            System.out.println("회원의 등급 : GOLD");
////        } else if(point > 40) {
////            System.out.println("회원의 등급 : SILVER");
////        } else if(point > 20) {
////            System.out.println("회원의 등급 : BRONZE");
////        } else if(point <= 20) {
////            System.out.println("회원의 등급 : 일반");
////        }
//
//
////        if(point > VIP_POINT) {
////            System.out.println("회원의 등급 : VIP");
////        } else if(point > GOLD_POINT) {
////            System.out.println("회원의 등급 : GOLD");
////        } else if(point > SILVER_POINT) {
////            System.out.println("회원의 등급 : SILVER");
////        } else if(point > BRONZE_POINT) {
////            System.out.println("회원의 등급 : BRONZE");
////        } else if(point <= 20) {
////            System.out.println("회원의 등급 : 일반");
////        }
//
//
        if(point > VIP_POINT) {
            rating = "VIP";
        } else if(point > GOLD_POINT) {
            rating = "GOLD";
        } else if (point > SILVER_POINT) {
            rating = "SILVER";
        } else if(point > BRONZE_POINT) {
            rating = "BRONZE";
        } else if(point <= 20) {
            rating = "일반";
        }
        System.out.println("당신의 등급 : " + rating);

    }
}
