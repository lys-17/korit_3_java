package ch12_inheritance.products;

public class Product extends Item {
    private int price;
    private int stock;

    //빨간줄 생기길래 생성자 망들래서 만들었더니 부모 속성만 받아옴
    public Product(String name, String category, int price, int stock) {
        super(name, category);
        this.price = price;
        this.stock = stock;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    // ㄹ
}

