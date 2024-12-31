package while_;
public class Test {
    public static void main(String[] args) {
        //while문을 사용하여 구구단 2단 출력
        int dan = 2;
        int times = 1;
        System.out.printf("< %d단 > \n", dan);
        while(times <= 9){ // 조건식
            System.out.println(dan + " X " + times + "=" + (dan * times));
            times++; // 증감식
        }
        System.out.println("=====================================================");

        // while문을 사용하여 정수 1 ~ 10까지 합(total)을 계산 후 출력

        // 누적변수 선언 및 초기화
        int num = 0;
        int total = 1;
        // 초기식
        // while문 작성
        while(num <= 10){
            total += num;
            num++;
        }
        // total 출력 
        System.out.printf("1부터 10까지 정수의 합: %d \n", total);



    }
}
