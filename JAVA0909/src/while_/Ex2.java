package while_;

public class Ex2 {
    
    public static void main(String[] args) {
        /*
         * do ~ while문
         * - while 문은 조건을 먼저 검사하고 반복 여부를 결정하지만
         * do ~ while문은 일단 반복문을 먼저 실행하고 난 뒤에 조건을 검사하여 
         * 다음 반복 여부를 결정함
         * - while문은 조건식에 따라 반복문이 단 한번도 실행되지 않을 수 있지만
         * do ~ while문은 최소 한 번읠 실행은 보장됨
         * 
         * < 기본 문법 >
         * do {
         *  // 반복 실행할 문장
         * }while(조건식);
         * => caution: while문 뒤에 반드시 semi-colon(;) 필수!
         */

         int i = 11; // 초기식

         // 제어변수 i 초기값이 10보다 클 경우
         while(i <= 10){
            System.out.println("i = " + i);// 반복할 문장
            // 조건식 판별 결과가 false 이므로 반복문은 실행되지 못함!
            i++; // 증감식
         }
         System.out.println("while문 종료 후 i 값 = " + i);

         System.out.println("-----------------------------------------------------");
         
         do{ // 조건식이 없으므로 블록문이 무조건 한 번 실행
            System.out.println("i = " + i);// 반복할 문장
            i++;
         }while(i <= 10);
         System.out.println("while문 종료 후 i 값 = " + i);

    }
    
}
