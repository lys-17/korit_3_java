package ch00_rewiew;
/*
    지시 사항
    학생 정보를 저장하는 클래스를 구현하시오.
    다양한 접근 지정자를 조합하여, 정보 은닉 및 제한된 접근을 적용

    학생 클래스의 필드는 name, age, studentId, password입니다.
    name : 외부에서 읽고 쓸 수 있어야 함.               : 김일
    age : 외부에서 읽고 쓸 수 있어야 함.                : 17
    studentId : 같은 패키지에서만 접근 가능해야 함.      : 20250001
    password : 외부에서 직접 접근이 불가능 해야 함. -> setter만 제공  : qwer1234

    showInfo()를 call1 유형으로 정의하여
    학번 : 20250001
    이름 : 김일 학생
    나이 : 17세
    으로 출력될 수 있도록 하시오.
 */
class Student {
    public String name;          // 외부에서 접근 가능
    public int age;             // 외부에서 접근 가능
    int studentId;              // 같은 패키지에서만 접근 가능
    private String password;    // 접근 불가능

    // setter 정의
    public void setPassword(String password) {
        this.password = password;
    }

    public void showInfo() {
        System.out.println("학번 : " + studentId);
        System.out.println("이름 : " + name );
        System.out.println("나이 : " + age);
    }

}

public class Review12 {
    public static void main(String[] args) {
        System.out.println();

        Student student1 = new Student();

        student1.name = "김일";
        student1.age = 17;
        student1.studentId = 20250001;
        System.out.println(student1.name);
        System.out.println(student1.studentId);

        student1.setPassword("qwer1234");
        student1.showInfo();
    }

}
