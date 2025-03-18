package ch09_classes;

import ch08_methods.ScoreCalc2;

import java.util.Scanner;

public class ScoreClacMain {
    public static void main(String[] args) {
        //필요한 클래스들을 import

        Scanner scanner = new Scanner(System.in);
        ScoreClac scoreClac = new ScoreClac();

        //ch08의 ScoreClac2와 동일한 기능을 하도록 나머지 코드를 전부 작성하시오

        boolean endOfClac = false;
        double score1 = 0;
        double totalScore = 0;
        int totalSubject = 0;
        double avgScore = 0;

        // 점수 입력을 횟수를 상관없이 받기 위한 반복문 작성
        while (!endOfClac) {
            System.out.println("점수를 입력하세요(종료하려면 -1을 입력하세요)>>>>");
            score1 = scanner.nextDouble();
            //score1 = -1이 대입되었다면 반복문이 종료될 수 있도록 하는 조건문 작성
            if (score1 == -1) {  // 왜 "종료" 라든지 "x"가 아닌 -1을 입력했을 때 종료되도록 작성해야할까 ---> double 때문
                break;
                //endOfClac = true;
            }
            //합을 계산하는 코드
            totalScore = scoreClac.addScores(totalScore, score1);


            //평균을 계산하는 코드
            avgScore = scoreClac.calculateAvg(totalScore, totalSubject);

            System.out.println("-----점수 입력시마다 나오는 합계와 평균입니다 -------");
            System.out.println("입력한 점수의 합계 = " + totalScore);
            System.out.println("입력한 점수의 평균 = " + avgScore);

            totalSubject++;
        }
    }
}
