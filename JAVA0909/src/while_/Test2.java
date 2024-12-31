package while_;
public class Test2 {
    public static void main(String[] args) {
        
        // int hour = 0;
        int minute = 0;
        int second;

        while(minute < 60){
            second = 0;
            while(second < 60){
                System.out.printf("%d분 %d초 \n", minute, second);
                second++;   
            }
            minute++;
        }

        System.out.println("=====================================================");
        //구구단
        int dan = 2;
        int times;
        while(dan <= 9){
            System.out.printf(" < %d단 > \n", dan);
            times = 1;
            while(times <= 9){
                System.out.printf("%d X %d = %d \n", dan, times, (dan * times));
                times++;
            }
            dan++;
            System.out.println();
        }

    }
}
