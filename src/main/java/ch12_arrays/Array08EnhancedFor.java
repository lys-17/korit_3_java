package ch12_arrays;
/*
    향상된 for문(Enhanced For Loop)

    일반 for문과의 차이점
        일반 for문의 경우 인덱스 넘버(주소지)를 명확하게 알고 있어야
        하지만 일일이 element의 숫자를 세는 것이 번거롭기  때문에 arr01.length 와 같은
        방식으로 int값을 추출해서 대입함

        그런데 잘 생각해 보면 for (int i = 0;)




    제약 :
       읽기만 되고, 쓰기가 안됨.

    형식:
       for (자료형 변수명(단수) : 반복가능객체(복수) (배열)) {
            반복실행문
       }
 */
public class Array08EnhancedFor {
    public static void main(String[] args) {
        int[] numbers = new int[200];

        // 1부터 200까지 대입하시오
        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = (i+1);
        }

        // 일반 for문 형태로 1 2 3 4 5 6...200 출력
        for(int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        //향상된 for문으로 작성
        for(int number : numbers) {
            System.out.print(number + " ");
        }

        String[] names = { "강수림", "기준성","김미진", "김준식", "문성진",
                "심민호", "양지은", "유지현", "윤현지", "이동규", "이예성", "이정화",
                "전용남", "채수원", "한영진"};

        System.out.println();
        // 향상된 for문으로 String[] 배열 읽어오기
        for(String name : names) {
            System.out.println(name + " ");
        }
    }

}
