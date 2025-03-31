package ch17_static;

public class ProductMain {
    public static void main(String[] args) {
        // 정적 메서드의 호출
        System.out.println(Product.getCount());

        // 객체 생성
        Product product1 = new Product();

        // count / instanceCount 값 확인
        System.out.println(Product.getCount());             // 정적 메서드 호출
        System.out.println(product1.getInstanceCount());    // 일반 메서드 호출


        // 객체 생성
        Product product2 = new Product();
        System.out.println(Product.getCount());             // 정적 메서드 호출
        System.out.println(product2.getInstanceCount());    // 일반 메서드 호출

        System.out.println("product1 : " + product1.getInstanceCount());
    }
}
