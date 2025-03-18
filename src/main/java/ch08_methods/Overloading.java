package ch08_methods;
/*
    method overloading
    매개변수의 형태가 다르면 동일한 매서드 명을 가지고 정의할 수 있음

    즉, 매서드는 똑같고, pareamastar에 돌어가는 자료형 및 변수명을 달리 사용이 가능함

    overloading의 장점
    - 동일한 기능을 매서드를 정의할 때 매서드를

 */
public class Overloading {
    // 메서드 정의
    //call1() 유형으로 작성
    public static void main(String[] args) {
        System.out.println("add()");
    }

    public static void add(int a, int b) {
        System.out.println("add(int a, int b)");
        System.out.println("a + b =" + (a +b));
    }

    public static void add(int a, int b, int c) {
        //매서드 호출
        System.out.println("add(int a, int b, int c)");
        System.out.println("a + b + c=" + (a +b + c));
    }

    public static void add(String s, int a) {
        System.out.println("add(String s, int a)");
        System.out.println("/" + a);
    }

    public static void add(int a, String s) {
        System.out.println("add(int a, String s)");
        System.out.println(a + "/" + s);
    }

}
