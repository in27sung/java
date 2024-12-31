package for_;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Test {

	public static void main(String[] args) {
		// 1 ~ 9까지 증가 
		for( int i = 1; i < 10; i++) {
			System.out.printf("%d ", i);
		}
		System.out.println();
		System.out.println("=====================================");
		
		// 구구단
		int dan = 7;
		for ( int i = dan; i <= dan; i++) {
			System.out.printf("  <%d 단> \n",i);
			for( int j = 1; j < 10; j++) {
				System.out.printf("%d * %d = %d\n", i, j, i*j);
			}
		}

		
		
		
		
		
	}

}
