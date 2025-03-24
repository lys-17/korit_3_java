package ch00_rewiew;
/*
    목표 : 객체지향 설계 및 접근 지정자 이해를 바탕으로
    다양한 접근 수준의 필드와 메서드를 갖는 캐릭터 클래스를 정의하고
    이를 Review13Summary 클래스에서 기능을 테스트함

    클래스 설계
    1. 필드
    name -> 캐릭터 이름(공개 가능) - 전사
    health -> 체력 -> 읽기만 허용 -100
    power -> 공격력 -> 같은 패키지 -> 200
    skill -> 스킬이름(자식클래스만) -> 난무
    exp -> 경험치(외부에서 완전차단) -> 30

    2. 메서드
    getHealth() ->  체력값을 반환하는 getter
    attack() > 공격 동작시
               "name 이 power 로 공격" 출력
               "name 이(가) 경험치 amount 를 얻음"
    heal() > 체력을 10 회복하고, 현재 체력 출력
                " 체력이 10 회복됨 현재 체력 : health"
    gainExp(int amount) > call2() 유형인데 경험치를 증가시키는 메서드(내부 전용)
    실행 예
    name 이(가) 경험치 amount 를 얻음

    3. Review13Summary 클래스 예
    Character character1 = new Character("전사", 25, "난무");

    4. 실행 예
    캐릭터 이름 : 전사
    체력 : 100
    전사이(가) 25의 힘으로 공격
    전사이(가) 경험치 10을(를) 얻음
    전사의 체력이 회복됨 현재 체력 : 110
 */


class Character {
    //필드 선언
    String name;
    int health;
    int power;
    String skill;
    int exp;


    public Character(String name, int power, String skill) {
        this.name = name;
        this.power = power;
        this.skill = skill;
        this.health = 100;
        this.exp = 0;
    }

    // getHealth()

    public int getHealth() {
        return health;
    }

    // attack()
    public void attack() {
        System.out.println(name + " 이(가) " + power + "로 공격");
        this.gainExp(10);       // 메서드 내부에서 메서드를 호출한 사레
    }

    // heal()
    public void heal() {
        health += 10;   //먼저 더해줘ㅏ야 밑에 반영
        System.out.println(name + "의 체력이 " + health + "회복됨");

    }

    // gainExp(int amount)
    private void gainExp(int amount){
        exp += amount;
        System.out.println(name + " 이(가) 경험치 " + amount + " 얻음");
    }
}

public class Review13Summary {
    public static void main(String[] args) {
        Character character1 = new Character("전사", 25, "난무");

        // name 은 public 이기 때문에 직접 참조할 것
        System.out.println("캐릭터 이름 : " + character1.name);
        // health 는 getter 를 통해서 받아올 예정
        System.out.println("현재 체력 : " + character1.getHealth());
        character1.attack();    // attack()만 호출

        character1.heal();


//        character1.attack();
        /*
            전사이(가) 25의 힘으로 공격
            전사이(가) 경험치 10얻음

            class person {
                private String name;

            public String getName() {
                return name;
            }

                public void showInfo() {
                    System.out.println("이름은 " + this.getName() + "입니다.");
                }
            }
         */

    }
}
