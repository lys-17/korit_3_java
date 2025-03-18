package ch07_loops;
/*
    2중 for문
    for(int = 1; i<10; i++) {
    반복실행문1
    for(int j=0; i<5; j++) {
    반ㅂ복실행문2
    }
    반복실행문 1-b
    for(int  k=0; k<20; k++) {
    반복실행문3
    }
    반복실행문1-c
    }
                *
            **
            ***
            ****
            *****
 */
public class Loop07 {
    public static void main(String[] args) {
        for(int i = 0; i < 6; i++) {
            for(int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        /*
            별 찍기를 통한 for문 구조 학습
                        i = 0, j = 0이면 개행이 일어나야 함(실행문2는 실행x)
                        i = 1 일 때 j = 0 일 때는 * / j = 1일때는 개행
                        1 = 2 일 때 ,  j = 0이면 * / j =2 면 개행
            *
            **
            ***
            ****
            *****
        */

        // 100부터 0까지 역순으로 출력하는 for문을 작성하시오

        System.out.println();
        for(int i = 100; i > -1; i--) {
                System.out.println(i);
        }

        // 위의 별 찍기를 역순으로
        // #1
        for(int i = 5; i > 0; i--) {
            for(int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // #2
        for(int i = 0; i < 5; i++) {
            for(int j = 5; j-i > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
