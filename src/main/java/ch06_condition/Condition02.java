package ch06_condition;
/*
       if - else문 : if 다음에 있는 조건식이 true일 때는
       if 문 내의 {} 실핼문이 실행/ false 인 경우에는 else에 딸린 {} 실행문이 실행

       형식 :
       if (조건식) {
       실행문 1
       } else {
       실행문2
       }
 */
public class Condition02 {
    public static void main(String[] args) {
        int num = 0;
        if(num < 0) {
            System.out.println("num은 음수입니다");
        } else {
            System.out.println("num은 0이거나 양수입니다");
        }
    }
}
