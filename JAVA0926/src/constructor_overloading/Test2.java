package constructor_overloading;

public class Test2 {
	public static void main(String[] args) {
		
		MyDate2 d2 = new MyDate2(2024, 2, 29);

		
	}//main
}// class Test

// Define MyDate class 
class MyDate2{
	private int year;
	private int month;
	private int day;
	boolean isValid = true;
	
	// Constructor overloading
	public MyDate2(int year, int month, int day) {
		setYear(year);
		setMonth(month);
		setDay(day);
		isValid();
	}
	
	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		if (year <= 2100 && year >= 1900) {
			this.year = year;
		}
		else {
			isValid = false;
		}
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if(month > 0 && month <= 12) {
			this.month = month;
		}
		else {
			isValid = false;
		}
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		boolean leapYear = ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0));
		if (day > 0 && day <= 31) {
		switch(month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			this.day = day; 
			break;
		case 4: case 6: case 9: case 11:
			if (day < 31) {
				this.day = day;
			}
			else {
				isValid = false;
			}
			break;
		case 2:
			if (leapYear && day <= 29) {
					this.day = day;
				}
			else if(!leapYear && day < 29) {
				this.day = day;
			}
			else {
				isValid = false;
				}
			break;
			}
		}
		else {
			isValid = false;
		}
	}
	public void isValid() {
			if(isValid) {
				System.out.printf("%d년 %02d월 %02d일 \n", year, month, day);
			}
			else {
				System.out.println("값이 유효하지 않습니다.");						
			}
	}
}