package ch16_bean.person;

public class PersonMain {
    public static void main(String[] args) {
        Person person1 = new Person("김일", 20);
        Person person2 = new Person("김이");

        person2.setAge(20);

        System.out.println(person1);
        System.out.println(person2);

        PersonLombok person3 = new PersonLombok("김삼");
        PersonLombok person4 = new PersonLombok("김사", 14);

        person3.setAge(17);

        System.out.println(person3);
        System.out.println(person4);

        // 이상을 실행시켰을 때 person1,2 를 불러냈을 때 콘솔창에 찍히는 방식과
        // person3, 4를 불러냈을 때 콘솔창에 찍히는 방식이 다르다는 것을 알 수 있음
        // 이는 intellij(혹은 Java) 자체에서의 toString()의 재정의한 default 방식과
        // project Lombok 상에서의 toString() 메서드의 재정의 방식에 차이가 남

        // 그렇다면 PersonLombok 상에서의 toString() 메서드를 우리 입맛대로 수정하고 싶다면
        // 어떻해야 할까?

//        personLombok person5 = new PersonLombok();    // name 필드의 @NonNUll 때문에 오류 발생

        // personLombok의 toString() 메서드를 수정하여
        // 이름 : 김사
        // 나이 : 14
        // 로 출력될 수 있도록 재정의


    }
}
