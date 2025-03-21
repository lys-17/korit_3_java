package ch00_review;

class Data {
    private int intData;
    private String strData;

    public int getIntData() {
        return intData;
    }

    public void setIntData(int intData) {
        this.intData = intData;
    }

    public String getStrData() {
        return strData;
    }

    public void setStrData(String strData) {
        this.strData = strData;
    }


    // getter/ setter 만들고
    // main에서 data1 객체 생성하고
    // setter를 통해서 intData에 1750 입력
    // strData에 "집가는 시간"입력
    // getter를 활용해
    // 실행 예
    //오늘 1750은 집가는 시간
    //이 출력


}

public class Review10 {

    private int intData;
    private String strData;

    public static void main(String[] args) {
        Data data1 = new Data();
        data1.setIntData(1730);
        data1.setStrData("집 가는 시간");

        System.out.println("오늘 " + data1.getIntData() + "은 " + data1.getStrData());

    }
}
