package ch11_access_modifier;

class Person {
    private String name;

    //private 이기 떄문에 이 Person 클래스 외부에서는 name 을 참 조 할 수 없음

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    // setter / getter 는 보니까 access modifier 가 public 이니까 클래스 외부에서 사용할 수 있겠음
    //그러니까 우회를 통해서 Person 클래스의 객체의 속성값을 바꿀 수 있음
    // 귀찮은데 왜 하는 걸까?
    //어제 했던 것처엄 말도 안되는 데이터 값을 걸러내는 로직을 쓸 수 있음

    //PersonMain에서 person1 객체를 생성하는데,
    //처름 이름을 "김일"로 입력하고, 그 이름을 콘솔에 출력
    // 다시 이름을 "이일"로 입력하고, 바뀐 이름을 콘솔에 출력하시오

}

public class PersonMain {
    public static void main(String[] args) {
        //객체 생성
        Person person1 = new Person();
        person1.setName("김일");
        System.out.println(person1.getName());
        person1.setName("이일");
        System.out.println(person1.getName());

    }
}
