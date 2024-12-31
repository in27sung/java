package continue_break;

public class Ex2 {

    public static void main(String[] args) {

        EXIT_FOR:
        for(int dan = 2; dan <= 9; dan++){
            if(dan == 5){
                break EXIT_FOR;
            }
            System.out.printf(" < %d단 > \n", dan);
            for(int times = 1; times < 10; times++){
                System.out.printf("%d X %d = %d \n", dan, times, (dan * times));
            }
            System.out.println();// 줄바꿈
        }


        /*
         * Label 기능
         * - 반복문의 앞에 위치하여 break Ehsms continue의 동작 지점을 지정
         * - break문 또는 continue문 뒤에 해당 레이블의 이름을 지정할 경우
         *   Label 위치의 다음 반복문에 break 또는 continue문이 적용됨
         * - 주로, 중첨 반복문에서 반복문을 한꺼번에 빠져나가기 위해 사용
         * - 반복문 앞 또는 위에 주로 대문자로 된 문자를 작성하고 콜론(:)을 붙임
         * 
         * < 기본 문법 >
         * 레이블명:
         * 바깥쪽반복문(){
         *  안쪽반복문(){
         *      if(조건){
         *          break 레이블명; //또는 Continue 레이블명;
         *      }
         *  }
         * }
         */
    }
    
}
