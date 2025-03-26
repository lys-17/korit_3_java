package ch12_inheritance;

public class Tiger extends Animal { //(자식)클래스명 extends (부모) 클래스

    public Tiger() {
    }

    public Tiger(String animalName) {
        super(animalName);
    }

    public Tiger(int animalAge) {
        super(animalAge);
    }

    public Tiger(String animalName, int animalAge) {
        super(animalName, animalAge);
    }

    @Override           //얘가 붙어있다면 해당 메서드
    public String getAnimalName() {
        return super.getAnimalName();       //키워드 super.메서드명()
    }

    @Override
    public void setAnimalName(String animalName) {
        super.setAnimalName(animalName);
    }

    @Override
    public int getAnimalAge() {
        return super.getAnimalAge();
    }

    @Override
    public void setAnimalAge(int animalAge) {
        super.setAnimalAge(animalAge);
    }

    @Override
    public void move() {
        super.move();
        System.out.println("네 발로 움직임");
    }

    //Tiger 클래스 만의 고유 매서드
    public void hunt() {
        super.move();
        System.out.println("네 발로 움직임");
    }

}
