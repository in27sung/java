package continue_break;

public class Test {

    public static void main(String[] args) {
        /*
         * 1 ~ 100까지 정수의 합을 계산 (total 변수에 저장)
         * => 단, 합계가 1000보다 클 경우 반복문을 종료 후
         *    1000보다 커지는 시점의 정수(x)를 출력
         */

         int num = 1;
         int total = 0;

         while(true){
            total += num;
            if(total > 1000){
                System.out.println("합계의 값이 " + total + "가 되는 시점의 정수값: " + num);
                break;
            }
            num++;
        }

        System.out.println("=====================================================");
        num = 1;
        total = 0;
        while(true){
            if(num % 2 == 0){
                total -= num;
            }
            else{
                total += num;
            }
            if(total >= 100){
                System.out.println("합계의 값이 " + total + "이 되는 시점의 정수값: " + num);
                break;
            }
            num++;
        }

        total = 0;
        for(num = 1; ;num++){
            if(num % 2 == 0){
                total -= num;
            }
            else{
                total += num;
            }
            if(total >= 100){
                System.out.println("합계의 값이 " + total + "이 되는 시점의 정수값: " + num);
                break;
            }
        }


        System.out.println("=====================================================");

        // for문의 종류
        int x = 1;
        total = 0;
        // ----------------------------------------------------------
        // 1. 초기식을 생략한 형태의 for문 
        // 2. 조건식을 생략한 형태
        // 3. 증감식을 생략한 형태
        // 4. 모든조건 생략한 형태

    }
    
}
