package class_;

/*
 *  Define animal class 
 *  1. aynalise 
 *  	- attribute: name string, age int  
 *  	- method:  bark 
 *  
 *  2.  Define class
 *  < Create a class >
 *  [signature] class [className] {
 *  		// member variable
 *  		// Method 
 *  }
 */

public class Animal {
	
	// declear memberVariable (declear: make a empty space of variable/ no value)
	String name; 	//name 
	int age;
	
	// define method (assign a value to a variable)
	// bark(): No parameter, No return
	public void bark() {
		System.out.println("멍!");
	}

}
