package ch15_objects;

public class ObjectTest {
    // 필드 선언
    private String name;
    private String address;


    // 기본 생성자, 매개 변수 생성자(AllArguConstructor)를 생성

    // getter / setter 생성

    // displayInfo()를 call1() 형식으로 정의


    public ObjectTest() {}

    public ObjectTest(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void displayInfo1() {
        System.out.println("이름 : " + name);
        System.out.println("주소 : " + address);
    }

    public String displayInfo2() {
        return "이름 : " + name + "\n주소 : " + address;
    }

    @Override
    public String toString() {
        return "이름 : " + name + "\n주소 : " + address;
    }
}
