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
	    if(name.toLowerCase().startsWith("a")) {
			this.name = name
		} else {
			this.name = "User"
			println("The name (${name}) does not start with the Letter 'a' or 'A'")
		}
	}
	// you can have multiple init blocks
}
