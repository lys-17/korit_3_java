package ch09_classes;

public class ConctructorMain {
    public static void main(String[] args) {
        //기본 생성자를 통한 객체 생성
        Constructor constructor = new Constructor();

        //매개변수 생성자를 통한 객체 생성
        Constructor constructor2 = new Constructor(20);
        System.out.println(constructor2.num);

        //AllArgusConstructor를 이용해서 객체 생성
        Constructor constructor3 = new Constructor(20);
        System.out.println(constructor3.num);

        Constructor constructor4 = new Constructor("이예성");
        System.out.println(constructor4.name);

        constructor.showInfo();
        constructor2.showInfo();
        constructor3.showInfo();
        constructor4.showInfo();

//        constructor1.num = 1;
//        constructor1. name =


    }

}
