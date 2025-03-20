package src.oop

// You can specify default values in the original constructor
class User(
	firstname: String,
	var lastname: String = "LastName",
	var age: Int = 0
) {
	// Only allow names with that start with an A
	/// need an Initialisation block
	var name: String

	init {
	    if(firstname.lowercase().startsWith("a") || firstname.lowercase().startsWith("j")) {
			this.name = firstname
		} else {
			this.name = "User"
			println("The firstname (${firstname}) does not start with the Letter 'a' or 'A' or 'j' or 'J'")
		}
	}
	// you can have multiple init blocks

	//Secondary Constructors - you can have multiple
//	constructor(firstname:String) : this(firstname, "User-Lastname", 0)
//	constructor(name: String, lastname: String) : this(name, lastname, 0){
//		println("3rd constructor used")
//	}

}
