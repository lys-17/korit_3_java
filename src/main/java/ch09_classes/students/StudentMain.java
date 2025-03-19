package ch09_classes.students;

public class StudentMain {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student(2025002);
        Student student3 = new Student("김삼");
        Student student4 = new Student(2025004, "김사");
        Student student5 = new Student(2025005, "김오", 80.7);

        //비어있는 속성에 속성값을 대입하는 코드
        student1.studentCode = 2025001;
        student1.name = "김일";
        student1.score = 4.5;

        student2.name = "김이";
        student2.score = 100;

        student3.studentCode = 2025003;
        student3.score = 95.8;

        student4.score = 4.0;


//        Student student2 = new Student(student1.studentCode);
//        System.out.println(student2.studentCode);

//        Student student3 = new Student(student1.name);
//        System.out.println(student3.name);

        student1.showInfo();
        student2.showInfo();
        student3.showInfo();
        student4.showInfo();
        student5.showInfo();

        //student2

        Student2 student6 = new Student2();
        Student2 student7 = new Student2(2025002);
        Student2 student8 = new Student2("김삼");
        Student2 student9 = new Student2(2025004, "김사");
        Student2 student10 = new Student2(2025005, "김오", 80.7);

        //비어있는 속성에 속성값을 대입하는 코드
        student6.studentCode = 2025001;
        student6.name = "김일";
        student6.score = 4.5;

        student7.name = "김이";
        student7.score = 100;

        student8.studentCode = 2025003;
        student8.score = 95.8;

        student9.score = 4.0;

        student6.showInfo();
        student7.showInfo();
        student8.showInfo();
        student9.showInfo();
        student10.showInfo();


    }


}
