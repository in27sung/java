package variable_arguments;

public class Test {

	public static void main(String[] args) {
		
		VariableArgumentsTest vat = new VariableArgumentsTest();
		
		vat.print(1, 2, 3, 4, 5, 6, 7);
		vat.print();
	
		
	}

}

/*
 *  클래스명 : VariableArgumentTest
 *  정수를 0개 ~ 무한개로 전달받아 출력하는 print() 메서드 오버로딩 
 *  단, 정수를 0개 전달할 경우 "전달받은 정수 없음!" 출력하고 
 *  1개 이상을 전달할 경우 전달받은 정수를 출력 
 */
class VariableArgumentsTest{
	
	public void print(int... numbers){
		if(numbers.length != 0) {
		for(int i : numbers) {
			System.out.print(i + " ");
			}
		}
		else {
			System.out.println("전달받은 정수 없음!");
		}
		System.out.println();
	}
}
