package src.oop

class User(
	name: String,
	var lastname: String,
	var age: Int
) {
	// Only allow names with that start with an A
	/// need an Initialisation block
	var name: String

	init {
	    if(name.lowercase().startsWith("a") || name.lowercase().startsWith("j")) {
			this.name = name
		} else {
			this.name = "User"
			println("The name (${name}) does not start with the Letter 'a' or 'A' or 'j' or 'J'")
		}
	}
	// you can have multiple init blocks

	//Secondary Constructors - you can have multiple
	constructor(name:String) : this(name, "User-Lastname", 0)
	constructor(name: String, lastname: String) : this(name, lastname, 0){
		println("3rd constructor used")
	}

}
