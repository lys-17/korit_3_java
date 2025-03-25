package ch12_arrays;

/*
      배열의 출력

      이전 수업에서 sout(arr) 형태로 배열을 출력하게 되면 배열은 참조 변수이기 떄문에 주소값만 출력된다는 점을 확인
      그리고 반복문을 통해 element 들을 불러올 수는 있지만 배열 전체를 출력하는 방법은 현재까진 없었음

      Arrays 클래스를 사용하고, 정적 메서드 .toString(배열명)을 사용하면 배열 전체를 출력할 수 있음

      여기서 클래스명.메서드명()이라는 점에 주목할 필요가 있음
      scanner.nextLine()과는 다름
      그리고 또한 toString()이라는 메서드도 곧 사용함

      여기서 기억해야 할 점은 동일한 method명이라고 하더라도 어떤 클래스에 종속되어있는가에 따라
      다른 결과값을 지닐 수 있다는 점임
      ex) random.nextInt();-------->
      ex) random.nextInt();-------->



 */

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

public class Array11 {
    public static void main(String[] args) {
        //동일한 메서드명이지만 클래스레 따라 다른 로직이라는 점의 예시
//        Random random = new Random();
//        Scanner scanner = new Scanner(System.in);
//
//        int num1 = random.nextInt();
//        System.out.println(num1);
//        int num2 = scanner.nextInt();
//        System.out.println(num2);

        // 10칸 짜리 빈 배열 nums를 선언하시고 1~10까지 집어넣으시오
        // 그리고 1 2 3 4 ...10 으로 출력할 수 있게끔
        // 일반 for문 / 향상된 for문으로 작성하시오


        int[] nums = new int[10];
        for(int i = 0; i < nums.length; i++) {
            nums[i] = i + 1;
            System.out.print(nums[i] + " ");
        }

        System.out.println();
        for(int num : nums) {
            System.out.print(nums);
        }

        // 이상의 코드를 작성하면 어쨌든 nums라는 배열 내에 1~10까지의 element가 있다는 것을 확인할 수 있음

        System.out.println();
        //배열 전체 출력 방법
        System.out.println(Arrays.toString(nums));          // 보기만할 때 쓰는 애

        Integer[] numbers = {4, 7, 1, 9, 6, 2, 5, 8, 10, 3};
        System.out.println("정렬 전 배열 : " + Arrays.toString(numbers));

        for(int i = 0; i < nums.length; i++) {
            System.out.println(numbers[i] + " ");
        }

        System.out.println();
        // 오름 차순 정렬
        Arrays.sort(numbers);       // 대부분의 경우에는 메서드를 사용하고 나면 그 결과 값을 변수에 대립해
        //왔지만 .sort


        System.out.println();
        System.out.println("정렬 후 배열 : " +Arrays.toString(numbers));

        //내림차순 배열
        Arrays.sort(numbers, Comparator.reverseOrder());
        // 오름차순 시에 사용했던 sort()와 마찬가지로 배열 자체를 다 바꿈
        //.sort() 내부의 argument가 두 개 라는 점에서 여러분들은
        // overloading이 이루어졌다는 점을 추측할 수 있으면 현재는 만족스럽습니다
        // Comparator.reverseOrder() 메서드를 사용하기 위해서
        // int[] -> Interger[]로 바꿨는데, 기본 자료형 int를 String처럼
    }
}
