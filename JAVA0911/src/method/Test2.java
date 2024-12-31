package method;

public class Test2 {

	public static void main(String[] args) {

		print("아이티윌 부산교육센터!");
		System.out.println("-----------------------------------------------------");
		checkNumber(0);
		System.out.println("-----------------------------------------------------");
		String result = checkNumber2(1);
		System.out.println(result);

		
	}// main method
	//3. Parameter(o), return(x)
	public static void print(String sentence) {
		System.out.println(sentence);
	}
	public static void checkNumber(int number) {
		int checking = number % 2;
		if(checking == 0) {
			System.out.println("짝수");
		}
		else if(checking == 1){
			System.out.println("홀수");
		}
	}
	public static String checkNumber2(int number) {
		int checking = number % 2;
//		String result = null;
		if(checking == 0) {
			return "짝수";
		}
		else if(checking == 1){ 
			return "홀수";
		}
		else {
			return "알수없음";
		}
//		return result;
	}
	
	
	
}// Class
