package ch08_methods;

import java.util.Scanner;

/*
     별찍기 관련한거 매서드로 구현할 예정
 */
public class Method02 {
    public static String getStar(int rows, int select) {
        // call4
        String result = "";

        if (select == 1) {
            for (int i = 0; i < rows + 1; i++) {
                for (int j = 0; j < i; j++) {
                    result += "*";
                }
                result = "\n";
            }
        }else if (select == 2) {
            for(int i = 0; i < rows; i++){
                for(int j = 0; j < rows -(i+1); j++) {
                    result += "  ";
                }
                for(int k = 0; k < i +1; k++) {
                    result += "*";
                }
                result += "\n";
            }
        }else if (select == 3) {
            for(int i = 0; i < rows; i++){
                for(int j = rows; j-i < rows; j--) {
                    result += "*";
                }
                result += "\n";
            }
        }else if (select == 4) {
            for (int i = 0; i < rows; i++) {
                for (int j = rows; j < rows - 1; j--) {
                    result += "  ";
                }
                for (int k = 0; k < i + 1; k++) {
                    result += "*";
                }
                result += "\n";
            }

        } else   {
            result = "잘못입력하셨습니다";
        }
        return result;
    }








    public static void main(String args) {
        //scanner를 import
        Scanner scanner = new Scanner(System.in);
        // 사용할 변수 목록 선언 및 초기화
        int rowOfStars = 0;
        int choice = 0;
        String starResult = "";

        System.out.println("몇 줄짜리 별을 생성할까요? >>>");
        rowOfStars = scanner.nextInt();

        System.out.println("1. 왼쪽으로 치우친 증가하는 별");
        System.out.println("2. 오른쪽으로 치우친 증가하는 별");
        System.out.println("3. 왼쪽으로 치우친 감소하는 별");
        System.out.println("4. 오른쪽으로 치우친 감소하는 별");
        System.out.println("메뉴를 선택하세요 >>>");
        choice = scanner.nextInt();

        starResult = getStar(rowOfStars, choice);
        System.out.println(starResult);


    }
}