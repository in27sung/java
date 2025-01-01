package io_2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Ex4 {

	public static void main(String[] args) {
		/*
		 * 객체 직렬화(Serialization) & 역직렬화(Deserialization)
		 * - 자바에서 사용하는 객체는 상태(변수 값)가 계속 변하는 영속성을 부여함
		 *   이때 어떤 순간의 상태(변수 값)를 파일 또는 네트워크 등으로
		 *   보내는 것을 '직렬화'라고 하며, 반대로 파일이나 네트워크로부터
		 *   데이터를 읽어 객체로 변환하는 것을 '역직렬화'라고 함
		 * - 직렬화란 인스턴스 내용을 연속 스트림으로 만드는 것이고, 스트림을 만들어야
		 *   파일에 쓸 수도 있고 네트워크 전송할 수도 있다.
		 * - 직렬화 과정을 통해 인스턴스 변수 값을 스트림으로 만들게 된다.
		 * - ObjectInputStream, ObjectOutputStream 클래스 사용
		 * - 주의! 직렬화 대상이 되는 클래스를 정의할 때는
		 *   반드시 Serializable 인터페이스 상속 필수!
		 * - 만약, 직렬화 클래스 내에서 출력 대상으로부터 제외시킬 변수가 있을 경우
		 *   해당 변수 선언부 앞에 transient 키워드를 사용하면 출력대상에서 제외됨
		 *   
		 * < 직렬화 문법 >
		 * ObjectInputStream(InputStream in)
		 * 
		 * < 역직렬화 문법 >
		 * ObjectOutputStream(OutputStream out)
		 */
		
		Person p = new Person("홍길동", 20, "051010-3123456");
		Person p2 = new Person("이순신", 44, "801111-1234567");
		
		File f = new File("/Users/Insung/Documents/temp/person.txt");
		
		// Person 객체를 외부 파일로 출력하기 (= 직렬화, Serialization)
		// => ObjectOutputStream 객체를 생성하여 FileOutputStream 객체 연결
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f))) {
			oos.writeObject(p);
			oos.writeObject(p2);
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("객체 출력 완료!");
		
		System.out.println("========================================================");
		
		// 외부 폴더(C드라이브 - temp - person.txt)에 저장되어 있는 파일 내의
		// Person 객체를 ObjectInputStream 객체를 사용하여 읽어오기
		// => 역직렬화(Deserialization)
		
		try(ObjectInputStream ois = 
				new ObjectInputStream(new FileInputStream(f))) {
			// ObjectInputStream 객체의 readObject() 메서드를 호출하여
			// 파일에 저장된 객체를 Object 타입으로 읽어오기
			// => 리턴타입이 Object 타입으로 실제 객체 사용을 위해 다운캐스팅 필요
//			Person person = (Person)ois.readObject();
			
			Object o = ois.readObject();
			if(o instanceof Person) {
				Person person = (Person)o; // 다운캐스팅
				// toString() 메서드가 오버라이딩 되어 있으므로 변수명 바로 전달
				System.out.println(person);
			}
			
			Person person2 = (Person)ois.readObject();
			System.out.println(person2);
			
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println("객체 입력 완료!");

	}

}

// 직렬화를 위한 Person 클래스 정의
// => 주의! 직렬화 대상이 되는 클래스를 정의할 때 반드시 Serializable 인터페이스 상속 필수!
//    별도의 추상 메서드가 없는 단순한 마커(Marker) 용도의 인터페이스
class Person implements Serializable {
	String name;
	int age;
	String jumin;
	
	public Person(String name, int age, String jumin) {
		super();
		this.name = name;
		this.age = age;
		this.jumin = jumin;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", jumin=" + jumin + "]";
	}
	
}













