package ch16_bean.person;

import lombok.Setter;

public class Person {
    // 필드 선언
    // 접근 지정자와 자료형 사이에 final 명시하는 경우

    // name에 final 선언하면 빨간 줄이 뜨는데
    // 여태까지는 해결 방법으로 NAME으로 고치고 거기에 = "데이터";
    // 넣어줘서 초기화를 꼭 시켜옴

    // 지금 시도한 방법
    // final이 이 붙은 필드를 필수적으로 포함하는 매개변수를 생성

    private final String name;
    @Setter
    private int age;

    // 필수적인 필드를 포함한 RequiredArgusConstructor를 생성
    public Person(String name) {
        this.name = name;
    }

    // AllArgusConstructor 생성

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    // getter/ setter 정의


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
