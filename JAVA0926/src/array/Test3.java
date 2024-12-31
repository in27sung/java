package array;

public class Test3 {
	
	public static void coin(int money, int coin[], int coinNum[]) {
		System.out.printf("money = %d원 \n", money);
		for(int i = 0; i < coin.length; i++) {
			 coinNum[i] = money / coin[i];
			 money %= coin[i];
			 System.out.printf("%d원 = %d개 \n", coin[i], coinNum[i]);
			}
		}

	public static void main(String[] args) {

		int money = 2680;
		int coin[] = {500, 100, 50, 10};
		int[] coinNum = new int[4];
		
		coin(money, coin, coinNum);
		
	
	}

}
