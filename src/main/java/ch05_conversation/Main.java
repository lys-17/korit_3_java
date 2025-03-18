package ch05_conversation;

public class Main {
    public static void main(String[] args) {
        /*
        conversation 형변환 -> 용량 상의 문제로 일어나는 이수를 해결하기 위해서 사용

        1) upcasting = 더 큰 용량의 자료형으로 변환시키는 것
         */
        char cast1 = 'A';
        System.out.println("원형 : " + cast1);
        // 업케스팅 방법 #1
        // 형변환을 하기 위해서는 "(바꿀데이터단입)변수형"으로 작성하면 됨
        System.out.println("변형 : " + (int)cast1);

        char cast2 = 'a';
        System.out.println("원형 : " + cast2);
        System.out.println("변형 : " + (int)cast2);

        //업캐스팅 방법 #2
        char cast3 = 'b';
        // 새로운 변수를 선언하여 집어넣는 방법임
        int cast4 = cast3;

        //2) downcasting : 더 적은 용량의 자료형으로 변환시키는 것
        int cast5 = 99;
        int cast6 = 100;
        //지시사항 : 다운캐스팅하는 방법을 업캐스팅 #1, 2를 이용하여 char형으로 바꾼 후 큰솔함에 변형을 모두 출력

        //다운캐스팅 방법 #1
        System.out.println("원형 : " + cast5);
        System.out.println("변형 : " + (char)cast6);

        //다운캐스팅 방법 #2
        char cast7 = (char)cast6;
       //char cast7 = (char)cast6; : 오류 발생함 upcasting 과 downcasting 의 성격 차이

        System.out.println("원형 : " + cast6);
        System.out.println("변형 : " + cast7);

        /*
        추후 수업 예정이긴 한데 간단하게 설명
        upcasting의 경우에는 메모리 용량이 커지기만 하면 기존 테이터
         */

    }
}
