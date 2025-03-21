package ch00_review;

/*
    클래스 - 설계도 / 틀 / 청사진
    클래스 내부에는 속성(필드/멤버변수/인스턴스변수) / 행위(메서드)
 */
class Developer {
    //필드 선언
    String name;
    boolean window;
    boolean java;
    boolean python;
    int career;
    String company;

    // 생성자 정의 -> 원래 기본 생성자는 default로 있음

    // introduce 메서드를 정의
//    viod introduce() {
//        System.out.println("안녕하세요 " + developer1.name + "입니다 " + developer1.company + "에서 일하고 있으며 경력은 " + developer1.career + "년 되었습니다");
//        System.out.println("window PC 소유 여부 : " + developer1.window);
//        System.out.println("java 능력 소유 여부 : " + developer1.java);
//        System.out.println("python 능력 소유 여부 : " + developer1.python);
}
public class Review07 {
    // 기본 생성자로 객체 생성하고 싶다면 바로 가능
    Developer developer = new Developer();
    /*

        전부 다 main 단계에 작성
        이름
        window PC 소유 여부 yes
        company 코리아아이티아카데미
        java 능력 소유 여부 yes
        python 능력 소유 여부 no
        career 3

        속성에 값을 대입하려면 어떡해야 할까요
        작성하고 콘솔링

        안녕하세요 제 이름은 000입니다
        현재 저는 코리아아이티아카데미에서 일하고 있으며 경력은 3년 되었습니다
        window PC 소유 여부 : true
        java 능력 소유 여부 : true
        python 능력 소유 여부 : fasle
        열심히 하겠습니다

        출력
     */
    public static void main(String[] args) {
        Developer developer1 = new Developer();
        developer1.name = "이예성";
        developer1.company = "코리아아이티아카데미";
        developer1.career = 3;
        developer1.window = true;
        developer1.java = true;
        developer1.python = false;

//        System.out.println("안녕하세요 " + developer1.name + "입니다 " + developer1.company +
//                "에서 일하고 있으며 경력은 " + developer1.career + "년 되었습니다");
//        System.out.println("window PC 소유 여부 : " + developer1.window);
//        System.out.println("java 능력 소유 여부 : " + developer1.java);
//        System.out.println("python 능력 소유 여부 : " + developer1.python);

        //52-56까지 자기소개에 해당하는데 전부 메인에 작성하니까 너무 김
        // 메서드화시켜서 그냥 메인에서는 호출만 하고 싶음

    }

}
