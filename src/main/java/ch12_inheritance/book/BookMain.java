package ch12_inheritance.book;

public class BookMain {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.setTitle("자바의 정석");
        book1.setAuthor("남궁성");

        System.out.println("이 첵의 제목은 " + book1.getTitle() + "입니다");
        System.out.println("이 첵의 저자는 " + book1.getAuthor() + "입니다");

        EBook eBook1 = new EBook();


    }
}
