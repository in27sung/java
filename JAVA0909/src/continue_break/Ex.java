package continue_break;

public class Ex {

    public static void main(String[] args) {
        /*
         * break문과 coutinue문
         * - 반복문 내에서 특정 조건식과 결합하여
         * 반복문의 실행 흐름을 제어하는 용도로 사용
         * 
         * 1. break문
         * - 반복문 내에서 조건식에 따라 반복문을 종료하는 용도로 사용
         *   주로 if문과 조합하여 반복문을 빠져나갈 조건을 설정
         * 
         * < 기본 문법 >
         * for(초기식; 조건식; 증감식) 또는 while(조건식) {
         *  if(조건){
         *      break; //현재 소속된 반복문의 블록문을 빠져나감(종료)
         *  } 
         * }
         * 
         * 2. continue문
         * - 반복문 내에서 조건식에 따라 반복문의 다음 문장 실행을 생략하고
         *   다음 반복을 진행하는 용도로 사용
         * 
         * < 기본 문법>
         * for(초기식; 조건식; 증감식) 또는 while(조건식){
         *  if(조건){
         *      continue; // for문의 증감식 또는 while문의 조건식으로 이동 
         *  }
         * }
         */

         int i;

         for(i = 1; i <= 10; i++){
            System.out.println(i);
            if(i == 5){
                break;
            }
         }
         System.out.println("for문 종료 후 i 값 = " + i);
         
         i = 1;
         while(i <= 10){
            System.out.println(i);
            if(i == 5){
                break;
            }
            i++;
         }
         System.out.println("for문 종료 후 i 값 = " + i);

        System.out.println("=====================================================");

         for(i = 1; i <= 10; i++){
            if(i == 5){
                System.out.println("i = 5의 값을 생략");
                continue;
            }
            System.out.println(i);
         }
         System.out.println("for문 종료 후 i 값 = " + i);

    }
    
}
