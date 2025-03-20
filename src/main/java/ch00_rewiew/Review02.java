package ch00_rewiew;

public class Review02 {
    public static void main(String[] args) {
        /*
            연산자
            1) 대입 연산자 =
            2) 복합 대입 연산자
                +=
                -=
                *=
                ==
         */


        // 1. 이상의 변수에 세로 30.3 / 가로 124.37인 사각형의 넓이를 구하시오
        // 2. 동일한 가로 세로의 삼각형의 넓이를 구하시오
        // 실행 예
        // 가로 124.37, 세로 30.3인 삼각형의 넓이는 ...이고 사각형의 넓이는 000이다

        double height = 30.3;
        double weidth = 124.37;


        System.out.println( 30.0 * 124.37 / 2);
        System.out.println(30.0 * 124.37);



        System.out.println("가로" + weidth +  "세로" + 30.3 +  "삼각형의 넓이는 " + ( 30.0 * 124.37 / 2) +
                "이고 사각형의 넓이는 " + (30.0 * 124.37) + "이다");
        // 이상의 코드에서 볼 수 있듯이 삼각형의 넓이는 사각형넓이의 /2
    }
}
