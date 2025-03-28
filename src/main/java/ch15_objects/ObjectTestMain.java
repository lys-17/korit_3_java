package ch15_objects;
/*

 */
public class ObjectTestMain {
    public static void main(String[] args) {
        String strExample1 = "안근수";
        String strExample2 = new String("안근수");

        boolean result1 = strExample1 == strExample2;
        System.out.println(result1);    //false
        boolean result2 = strExample1.equals(strExample2);
        System.out.println(result2);    //true

        ObjectTest objectTest1 = new ObjectTest("안근수", "부산광역시 연제구");
        objectTest1.displayInfo1();

        //objectTest2 객체를 기본 생성자로 만들고 setter를 통해서 이름 주소
        //displayInfo2()를 call3 유형으로 작성해서

        ObjectTest objectTest2 = new ObjectTest();
        objectTest2.setName("이예성");
        objectTest2.setAddress("양산");

        System.out.println(objectTest2.displayInfo2());

        System.out.println(objectTest2);

    }
}
