package while_;

public class Ex3 {
    
    public static void main(String[] args) {
        /*
         * 중첩 while문
         * 
         * < 기본 문법 >
         * 초기식1;
         * 
         * while(조건식1){
         *  //초기식 2;
         *   while(조건식2){
         *     // 반복할 문장
         *     // 증감식2;
         *  }
         * 
         *  증감식1;
         * }
         */

      
         // for loop를 사용하여 i값이 1 ~ 5까지 반복할 동안
         // j값이 1 ~ 3까지 반복하는 중첩 for loop
         
         for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= 3; j++){
               System.out.printf("i = %d, j = %d \n" , i, j);
            }
         }

         int i = 1;
         
         while(i <= 5){
            int j = 1;

            while(j <= 3){
               //반복할 문장
               System.out.println("i = " + i + ", j = " + j);
               j++; // 증감식 2
            }
            i++; // 증감식 1
         }
   }
    
}
