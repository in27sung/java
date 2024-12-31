package wrapper_class;

public class Ex {

	public static void main(String[] args) {
		/*
		 * Wrapper 클래스
		 * - 기본 데이터타입을 객체 형태로 관리해주는 클래스의 모음 
		 *   -> java.lang 패키지에 위치 
		 * - 기본 데이터타입과 1:1로 대응하는 8개의 클래스를 제공 
		 *   (Byte, Short, Integer, Long, Float, Double, Doolean, Character) 
		 * - Wrapper 클래스에서 제공하는 상수와 메서드 등을 활용하여 
		 *   기본 데이터 타입 데이터를 다양하게 처리할 수 있음. 
		 */
		
		System.out.println("byte 타입 메모리 크기(bit): " + Byte.SIZE);
		System.out.println("byte 타입 메모리 크기(byte): " + Byte.BYTES);
		System.out.println("byte 타입 최댓값: " + Byte.MAX_VALUE);
		System.out.println("byte 타입 최솟값: " + Byte.MIN_VALUE);
		
		System.out.println();
		
		System.out.println("short 타입 메모리 크기(bit): " + Short.SIZE);
		System.out.println("short 타입 메모리 크기(byte): " + Short.BYTES);
		System.out.println("short 타입 최댓값: " + Short.MAX_VALUE);
		System.out.println("short 타입 최솟값: " + Short.MIN_VALUE);
		
		System.out.println("char 타입 메모리 크기(bit): " + Character.SIZE);
		System.out.println("char 타입 메모리 크기(byte): " + Character.BYTES);
		System.out.println("char 타입 최댓값: " + (int)Character.MAX_VALUE);
		System.out.println("char 타입 최솟값: " + (int)Character.MIN_VALUE);
		
		System.out.println("int 타입 메모리 크기(bit): " + Integer.SIZE);
		System.out.println("int 타입 메모리 크기(byte): " + Integer.BYTES);
		System.out.println("int 타입 최댓값: " + Integer.MAX_VALUE);
		System.out.println("int 타입 최솟값: " + Integer.MIN_VALUE);
		
		System.out.println("long 타입 메모리 크기(bit): " + Long.SIZE);
		System.out.println("long 타입 메모리 크기(byte): " + Long.BYTES);
		System.out.println("long 타입 최댓값: " + Long.MAX_VALUE);
		System.out.println("long 타입 최솟값: " + Long.MIN_VALUE);
		
		System.out.println("float 타입 메모리 크기(bit): " + Float.SIZE);
		System.out.println("float 타입 메모리 크기(byte): " + Float.BYTES);
		System.out.println("float 타입 최댓값: " + Float.MAX_VALUE);
		System.out.println("float 타입 최솟값: " + Float.MIN_VALUE);
		
		System.out.println("double 타입 메모리 크기(bit): " + Double.SIZE);
		System.out.println("double 타입 메모리 크기(byte): " + Double.BYTES);
		System.out.println("double 타입 최댓값: " + Double.MAX_VALUE);
		System.out.println("double 타입 최솟값: " + Double.MIN_VALUE);
	}

}
