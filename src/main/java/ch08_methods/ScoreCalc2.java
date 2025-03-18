package ch08_methods;

import java.util.Scanner;

public class ScoreCalc2 {
//    //매서드 정의
//    // 1. 총합을 내는 매서드 : call4() 유형으로 작성 예정 매개변수 / return
//    public static double addScores(double score1, double score2) {
//        return score1 + score2;
//    }
//
//    // 2. addScore() 매서드를 overLoading하여 매개변수가 3개의 매서드를 만드시오
//    public static double addScores(double score1, double score2, double score3) {
//        return score1 + score2 +score3;
//    }
//
//    // 3. addScore() 매서드를 overLoading하여 매개변수가 4.5.6개의 매서드를 만드시오
//    public static double addScores(double score1, double score2, double score3, double score4) {
//        return score1 + score2 + score3 + score4;
//    }
//    public static double addScores(double score1, double score2, double score3, double score4, double score5) {
//        return score1 + score2 + score3 + score4 + score5;
//    }
//    public static double addScores(double score1, double score2, double score3, double score4,double score5,double score6) {
//        return score1 + score2 + score3 + score4 + score5 + score6;
//    }
//
//    // 결론 - 오버로딩이라는 개념 자체는


    // 1. 그래서 일단 합계를 낼 때, 두 개 짜리면 생성할 예정
    public static double addSubject(double totalScore, double numberOfSubjects) {
        return totalScore + numberOfSubjects;
    }

    public static void main(String[] args) {
//        double sum = addScores(100,95);
//        System.out.println(sum);
//
//        System.out.println(addSubject(totalScore: 4.5, addedsubject: 3.5));
//        System.out.println(addSubject(totalScore: 4.5, addedsubject: 3.5) / 2);
//
//        System.out.println();
//
//        //이상의 코드를 확인하게 됐을 때 알 수 있는 점은 addsubject() method의 결과값이 calcalate()method
//
//
//        double sumOfScore = addSubject(totalScore: 4.5, addScore:3.5);
//        int subjects = 2;
//        double avgScore =

        // 두 과목을 기준으로 합과 평균을 낸다는 점을 확인할 수 있다
        // method로 두 과목부터 100과


        // Scanner import
        Scanner scanner = new Scanner(System.in);

        //과목별 변수 목록
        boolean endOfClac = false;
        double score1 = 0;
        double totalScore = 0;
        int totalSubject = 0;
        double avgScore = 0;

        // 점수 입력을 횟수를 상관없이 받기 위한 반복문 작성
        while (!endOfClac) {
            System.out.println("점수를 입력하세요(종료하려면 -1을 입력하세요)>>>>");
            score1 = scanner. nextDouble();
            //score1 = -1이 대입되었다면 반복문이 종료될 수 있도록 하는 조건문 작성
            if(score1 == -1) {  // 왜 "종료" 라든지 "x"가 아닌 -1을 입력했을 때 종료되도록 작성해야할까 ---> double 때문
                break;
                //endOfClac = true;
            }
            //합을 계산하는 코드
            totalScore = addSubject(totalScore, score1);

            //평균을 계산하는 코드
//            avgScore = calculateAvg(totalScore, totalSubject);
            System.out.println("-----점수 입력시마다 나오는 합계와 평균입니다 -------");
            System.out.println("입력한 점수의 합계 = " + totalScore);
            System.out.println("입력한 점수의 평균 = " + avgScore);

            totalSubject++;

        }
    }

}