package ch08_methods;

import java.util.Scanner;

public class Method01 {
    /*
        여기에 매서드를 정의할 거임 즉, 이번 수업 이후부터는 main 을 꼭 치지 않는 class 가 생길 수 있음
     */



    // 1. [ x | x ][입력값 / 출력값]
    public static void call1 () {
        System.out.println("[ x | x ]");
        System.out.println("오늘은 별찍기와 method 에 대해 학습중입니다");
    }

    // 2. [ o | x ]
    public static void call2(String strExample) { //정의 단계에서() 내에 있으면 매개변수
        System.out.println("[ o | x ]");
        System.out.println("오늘의 스케줄 :" + strExample);
    }

    // 3. [ x | o ]
    public static String call3() { // return 의 자료형이 String 임을 명시
        System.out.println("[ x | o ]");

        String result = "";

        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < i+1; j++) {
                result += "*";
            }
            result += "/n";
        }

        return "";   // call1, 2와 달리 return 명령어가 있음
    }

    public static String call4(int year, int month, int date, String day) {
        String result = "";

        result = year + "년" + month + "월" + date + "일" + day + "요일입니다";

        return result;

        // main 에서 sout (call4(2025, 3, 17, "월"));입력하고 실행

    }

    public static int writeMyAge(int age) {
        int num = age;
        return num;
    }

    public static void writeMyAge2(int age) {
        System.out.println(age);
    }

    /*
        함수형 프로그래밍(function programing) -
         메서드와 return 같이 메서드2의 argument가 되고, 메서드2의 return 값이 매서드3의 argument가 되는 방식으로
         첫 번째 매서드로 부터 마지막 매서드까지의 흐름을 통해 프로그램이 이어지는 방식을 의미

         간단 예시
     */
    public static String introduce(String name, int age) {
        return "제 이름은 " + name + "이고, 나이는 " + age + "입니다 내년에는 " + (age + 1) + "살이 됩니다";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 여기 에서도 호출의 결과를 myName이라는 변수에 담음
        String myName = "";
        int myAge = 0;

        System.out.print("이름을 입력하시요 >>>");
        myName = scanner.nextLine();
        System.out.print("나이를 입력하시요 >>>");
        myAge = scanner.nextInt();
        System.out.println(introduce(myName, myAge));
        // 이상의 코드는 scannner 의 매서드인 nextLine(). nectint)_l
        // name.age

        //그리고
    }



//    public static void main(String[] args) {
////        //md 파일에 작성한 3번 호출 방식을 사용할 것입니다.
////        call1();
////        call2("점심 고민"); // 호출 단계에서 ()내에 있는 것은 argument
////        call3();
////        System.out.println(call3());  //현재 상황에서는 불편해 보임
////        // 왜 main 단계에서 꼭 sout을 써야만 하는가
////        // 그냥 method 내부에 sout을 써두면 main 단계에서 편하게 호출할 수 있는데
////        System.out.println(call4(2025, 3, 17, "월"));
//
//        writeMyAge(26);
//        writeMyAge2(26);
//        //95번 라인 및 96번 라인의 실험결과 26이 한번만 나옴   -> 95번 라인이 안찍힘
//        System.out.println(writeMyAge(20));  //여전히 불편한 지점
//
//        int nextAge = writeMyAge(26) + 1;
//        System.out.println(nextAge);
//
//        int nextAge2 = writeMyAge(26) + 1;
//        System.out.println(nextAge2);
//    }



}
