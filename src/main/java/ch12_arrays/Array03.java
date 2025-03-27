package ch12_arrays;

import java.util.Scanner;

public class Array03 {
    public static void main(String[] args) {
        String[] names = { "강수림", "기준성","김미진", "김준식", "문성진", "심민호", "양지은", "유지현", "윤현지",
                "이동규", "이예성", "이정화", "전용남", "채수원", "한영진"};

        Scanner scanner = new Scanner(System.in);

        // 특정 배수를 추출하기 위한 기분점 변수
        System.out.println("어떤 숫자의 배수 번호 추출할래");
        int specificNum = scanner.nextInt();


        for (int i = 0 ; i < names.length ; i++) {
            if ( (i+1) %  specificNum == 0 ) {
                System.out.print(names[i] + " ");
            }
        }
    }
}
