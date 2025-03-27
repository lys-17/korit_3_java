package ch13_adstraction.interfaces;

public interface Press {

    String NAME = "button";
    // interface이기 때문에 변수 앞에 접근 지정자를 명시하지 않았지만
    /*
        public final이 생략되어있습니다 똫나 상수이기 때문에 대문자로 변경해두었고, 일반 클래스의 경우처럼 String name;이 불가능함 초기화가 필수

        그래서 안되는 것들은 다음
     */
    // String name;
    // public Press(); -> 인터페이스라서 생성자 생성이 불가능
    // void popOut(){
    //    System.out.println("추상메서트 x 일반메서드 o")
    //}

    // 되는거
    void onPressed();

    //interface인 Up.java / Down.Java를 생성하고
    //void 형태인 onUP() / onDown() 메서드 선언



}
