package ch07_loops;
/*
while문을 사용하여
1 2 3 4 5 6 7 8 9 10
~~~
이 출력되도록 하시오
 */
public class Loop03 {
    public static void main(String[] args) {

//        int num = 1;
//
//        while(num < 101) {
//            System.out.println(num + "");
//            if(num % 10 ==0) {
//                System.out.println();
//            }
//            num++;
//        }

        int num2 =1;
        while(num2 <101) {
            System.out.println(num2 + "" + (num2 +1) + "" );
            num2 += 10;

        }



    }
}
