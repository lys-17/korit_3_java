package ch00_rewiew;

import java.util.Scanner;

public class Review03 {
    public static void main(String[] args) {
        /*
            조건문
            if(조건식) {
                실행문
            }
            조건식 : true / false 로 결정나는 식
            조건식이 true 면 {} 내의 실행문이 실행됨

            전체 형식 :
            if(조건식1) {
                실행문1
            } else if (조건식2) {
                실행문2
            } else if (조건식3) {
                실행문3
            } else {
                실행문4
            }

            그리고, Nested if문
            if(조건식1) {
                실행문1-1
                if(조건식1-a) {
                    실행문1-a
                } else if(조건식1-b) {
                    실행문1-b
                } else {
                    실행문1-c
                }
                실행문1-2
            } else if(조건식2) {
                실행문2
            } else {
                실행문3
            }

            7세 미만은 탑승 불가
            110cm 미만은 탑승 불가
         */
        int age = 0;
        int height = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("나이를 입력하세요");
        age = scanner.nextInt();
        System.out.println("키를 입력하세요");
        height = scanner.nextInt();

        // 조건문
        if(age >= 7) {
            System.out.println("규정 나이 7세 이상입니다");
            if(height >= 110) {
                System.out.println("롤러코스터 입장이 가능합니다");
            } else {
                System.out.println("하지만 키가 작아서 안됨");
            }
            System.out.println("감사합니다");
        } else {
            System.out.println("규정 나이 미만으로 탑승 불가");
        }


        // 현재 age를 기준으로 중첩 if문이 작성되어있는데, height를 기준으로 중첩 if문을 작성

        if(height >= 110) {
            System.out.println("규정 키 110 이상입니다");
            if(age >= 7) {
                System.out.println("롤러코스터 입장이 가능합니다");
            } else {
                System.out.println("하지만 나이가 작아서 안됨");
            }
            System.out.println("감사합니다");
        } else {
            System.out.println("규정 키 미만으로 탑승 불가");
        }


        // 논리연산 --> && || !

        if(age >= 7 && height >= 110) {
            System.out.println("당신은 롤러코스터에 탈 수 있음");
        } else {        // 앞의 두 변수 중 하나라도 충족시키지 못하면 false임
                        // 키가 잘못됐는지 나이가 잘못됐는지는 이런 방식으로는 알수 없음
            System.out.println("키가 작거나 나이가 어려서 못탐 ㅅㄱ");
        }


    }
}
