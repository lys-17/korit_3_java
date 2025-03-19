package ch10_setter_getter.univ_student;
/*
    1. 클래스 설계
    name / grade(1, 2, 3) / score(double) -> 전부 private

    2. 생성자
        1) 기본 생성자
        2) 이름만 받는 생성자
        3) 학년만 받는 생성자
        4) 이름과 학년을 받는 생성자
        5) 이름, 학년, 점수를 받는 생성자

    3. Setter / Getter 메서드 정의 -> alt + ins 사용할 수 있습니다.
        각각 필드에 대한 setter / getter 를 생성합니다.
        setter 가 세 개 / getter 세 개
        1) setGrade 의 범위 1 ~ 4학년
        2) setScore 의 범위 0.0 ~ 4.5까지
        범위를 벗어나면 불가능한 입력입니다 가 출력되도록 작성하시오.

    4. UnivStudentMain 생성하시고
        student1 -> 기본 생성자 김일 / 1 / 3.3
        student2 -> 기본 생성자 김이 / 3 / -30 -> 실패하고 4.0
        student3 -> 기본 생성자 김삼 / 5 -> 실패하고 2 / 2.7
        student4 -> 기본 생성자 김사 / 4 / 3.8
        student5 -> 기본 생성자 김오 / 2 / 1.0

    5. 콘솔창에
        이름 : 김일
        학년 : 1학년
        점수 : 3.3
    으로 출력될 수 있도록 showInfo() 메서드를 call1() 유형으로 작성하시오.
    student1.showInfo();
    student2.showInfo();
    student3.showInfo();
    student4.showInfo();
    student5.showInfo();
 */
public class UnivStudent {

    String name;
    int grade;
    double score;

    public UnivStudent(String name) {
        this.name = name;
    }

    public UnivStudent(int grade) {
        if(grade > 0 || grade < 5) {
            System.out.println("불가능한 학년입력입니다");
            return;
        }
        System.out.println("학년이 입력되었습니다.");
        this.grade = grade;
    }

    public UnivStudent(double score) {
        if(score > 0.0 || score < 4.5) {
            System.out.println("불가능한 점수 입력입니다");
            return;
        }
        System.out.println("점수가 입력되었습니다.");
        this.score = score;
    }

    public UnivStudent(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public UnivStudent(String name, int grade, double score) {
        this.name = name;
        this.grade = grade;
        this.score = score;
    }

    public void showInfo() {
        System.out.println("이름 : " + name + "학년 :" + grade + "점수 :" + score);
    }


}
