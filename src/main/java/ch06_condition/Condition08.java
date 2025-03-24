package ch06_condition;

import java.util.Scanner;

/*
    사용자에게 score를 입력받아 다음과 같은 조건을 만족시키도록 작성하시오

    score가 0미만이거나 100초과라면 grade = x
    changedScore = 9~10, grade = A
    changedScore = 8, grade = B
    changedScore = 7, grade = C
    changedScore = 6, grade = D
    changedScore 가 5,4,3,2,1,0 이면 grade = F

    실행 예

    점수를 입력하세요 >>> 100
    점수는 100이고, 학점은 A학점입니다

    if문을 통해서 0미만 및 100-초과를 걸러내서 grade = x
    나머지 부분에 switch문을 작성하면 구형이 가능할 것임
 */
public class Condition08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;
        int changedScore = 0;
        String grade = "";

        System.out.println("점수를 입력하세요");

        score = scanner.nextInt();
        changedScore = score / 10;


        if(score < 0  || score > 100) {
            grade = "x";
        } else {     // 이 경우 score >= 0에서 score <= 100
            switch (changedScore) {
                case 10,9:
                    grade = "A";
                    break;
                case 8:
                    grade = "B";
                    break;
                case 7:
                    grade = "C";
                    break;
                case 6:
                    grade = "D";
                    break;
                default:
                    grade = "F";

            }
        }
        System.out.println("점수는 " + score + "이고 학점은" + grade + "입니다");
    }
}
