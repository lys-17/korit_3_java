package ch07_loops;

import java.util.Scanner;

/*
    while문과 for문을 섞은 사례

    1부터 n까지의 합을 구하는 반복문을
    반복하시겠습니까? >>>> y/n>>> n이 나올 때까지 반복할 것
 */
public class Loop06 {
    public static void main(String[] args) {
        //1. Scanner import
        Scanner scanner = new Scanner(System.in);
        boolean isEnded = false;
        String answer = "";

        while(!isEnded) {
            int n = 0;
            int sum = 0;
            System.out.println("1부터 몇까지의 합을 구하시겠습니까? >>>");
            n = scanner.nextInt();
            for(int i = 0; i < n+1; i++) {
                sum += i;
            }
            System.out.println("합은" + sum + "입니다");

            System.out.println("반목하시겠습니까? Y/N");
            scanner.nextLine();
            answer = scanner.nextLine();
            if(answer.equals("N")) {
                isEnded = true;
            }

        }

    }
}
