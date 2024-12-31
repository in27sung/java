package wrapper_class;

public class Test4 {

	public static void main(String[] args) {
		char upAlpha = 'A', lowAlpha = 'b',
			 num = '5', space = ' ',
			 hash = '#';
		
		char[] charArr = {'A', 'b', '5', ' ', '#'};
		
		for(char c: charArr) {
			if(Character.isUpperCase(c)) {
				System.out.printf("%c는 대문자\n", c);
			} else if(Character.isLowerCase(c)) {
				System.out.printf("%c는 소문자\n", c);
			} else if(Character.isDigit(c)) {
				System.out.printf("%c는 숫자\n", c);
			} else if(Character.isWhitespace(c)) {
				System.out.printf("%c는 공백문자\n", c);
			} else {
				System.out.printf("%c는 특수문자\n", c);
			}
		}
	}

}
