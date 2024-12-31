package constructor_overloading;

public class Test {
	public static void main(String[] args) {
		
		MyDate d1 = new MyDate();
		d1.showMyDate();
		
		MyDate d2 = new MyDate(2024);
		d2.showMyDate();
		
		MyDate d3 = new MyDate(2024, 9);
		d3.showMyDate();
		
		MyDate d4 = new MyDate(2024, 9, 26);
		d4.showMyDate();
	}//main
}// class Test

// Define MyDate class 
class MyDate{
	int year;
	int month;
	int day;
	
	public MyDate() { //Default constructor 
		year = 1999;
		month = 1;
		day = 1;
	}
	
	// Constructor overloading
	public MyDate(int year) { 
		this.year = year;
		month = 1;
		day = 1;
	}
	
	// Constructor overloading
	public MyDate(int year, int month) {
		this.year = year;
		this.month = month;
		day = 1;
	}

	// Constructor overloading
	public MyDate(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	public void showMyDate() {
		System.out.printf("%d년 %02d월 %02d일 \n", year, month, day);
	}
}