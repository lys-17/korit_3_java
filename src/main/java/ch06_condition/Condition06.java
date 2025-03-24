package ch06_condition;

import java.util.Scanner;

/*
     중첩 if
     if 문 내에 if문이 연속적으로 작성될 수 있음

     형식 :
         if(조건식1- a) {
            실행문1 - a
         } else if (조건식1- b) {
             실행문1 - b
         } else {
            실행문1 - c
         }
     } else if(조건식2) {
         실행문2
         if(조건식2 -a) {
            실행문2 - a
         } else {
             실행문2 - b
          }
     } else {
         실행문3
     }
 */
public class Condition06 {
    public static void main(String[] args) {
        /*
        사용자에게 score를 입력받아 다음과 같은 조건을 만족시키도록 하세요

        score가 이보다 작거나 100초과되면 grade는 x
        score 90-100 grade=a
        score 80-99 grade =b
        score 70-89 grade =c
        score 60-79 grade =d
        score 50-59 grade =f

        실행 예 #1
        점수를 입력하세요 >>>> -10
        입력한 점수는 -10점이며 학점은 x학점

        실행 예 #2
        점수를 입력하세요 >>> 92
        입력한 점수는 92점 이며 a학점입니다
         */

        // 1. Scanner import
        Scanner scanner = new Scanner(System.in);

        // 2. int score 선언(및 초기화)
        int score = 0;

        // 3. String grade 선언(및 초기화)
        String grade = "";

        // 4. Scanner를 입력 받기 위한 안내문 작성
        System.out.println("점수를 입력하시오 >>>");
        score = scanner.nextInt();

//        if(score < 0) {
//            grade = "x";
//        } else {        // 조건은 grade >= 0이 됨
//            if (score > 100) {
//                grade = "x";
//            } else {                    //이 부분의 조건은 grade>=0 && grade <=100이 됨
//                if (score > 90) {
//                    grade = "A";
//                } else if (score > 80) {
//                    grade = "B";
//                } else if (score > 70) {
//                    grade = "C";
//                } else if (score > 60) {
//                    grade = "D";
//                } else {        // 여기의 조건은 score>= && score <60
//                    grade = "F";
//                }
//            }
//        }

        //논리 연산자를 사용한 if문

        if(score > 100 || score < 0) {        //100초과 및 0 미만을 거르는 조건문 작성
            grade = "x";
        } else {
                if (score > 90) {
                    grade = "A";
                } else if (score > 80) {
                    grade = "B";
                } else if (score > 70) {
                    grade = "C";
                } else if (score > 60) {
                    grade = "D";
                } else {
                    grade = "F";
                }
        }
        System.out.println("점수는 " + score + "점이며 " + grade + "학점입니다");

    }
}