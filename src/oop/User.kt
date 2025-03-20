package src.oop

// You can specify default values in the original constructor
class User(
	var firstname: String,
	var middleName: String =  "",
	var lastname: String = "LastName",
	var age: Int = 0
) {


	//Secondary Constructors - you can have multiple
//	constructor(firstname:String) : this(firstname, "User-Lastname", 0)
//	constructor(name: String, lastname: String) : this(name, lastname, 0){
//		println("3rd constructor used")
//	}

}
