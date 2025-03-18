package ch08_methods;

import java.util.Scanner;

/*
         getstar() 매서드를 보면 내부에 if-else if-else 형태의 구문으로 매개변수를 1-4까지 받아서 출력하게끔 구현하였습니다.

         근데 if문을 작성하면 가독성이 떨어지기 때문에 이걸 째로 switch문으로 교체하여 동일한 기능을 하게끔  Refactoring 과정을 거치고자 합니다.
 */
public class Method03 {
    public static String getStar(int rows,int select) {
        String result = "";
        //여기에 method02에서 작성한 if문을 switch문으로 수정할 것
        // 필요한 부분은 condition 패키지를 확인
        switch(select) {
            case 1:
                for (int i = 0; i < rows + 1; i++) {
                    for (int j = 0; j < i; j++) {
                        result += "*";
                    }
                    result = "\n";
                }
                break;
            case 2:
                for(int i = 0; i < rows; i++) {
                    for (int j = 0; j < rows - (i + 1); j++) {
                        result += "  ";
                    }
                    for (int k = 0; k < i + 1; k++) {
                        result += "*";
                    }
                    result += "\n";
                }
                break;
            case 3:
                for(int i = 0; i < rows; i++){
                    for(int j = rows; j-i < rows; j--) {
                        result += "*";
                    }
                    result += "\n";
                }
                break;
            case 4:
                System.out.println("4. 오른쪽으로 치우친 감소하는 별");
                break;
            default:
                System.out.println();
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
