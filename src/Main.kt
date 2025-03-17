package src

fun main() {
	println("Welcome to Main - Learning")
	println("Introducing Variables")
	// Define Variable and its type
	var name: String = "Andy"
	// can redefine
	name = "Riley"
	// if your declare as:
	val type = "person"
//	type = "cat" // this will error in the IDE
	// Integers
	var age: Int = 22

	// Kotlin has type inference so you don't have to infer type
	var surname = "Farmer"
//	surname = 2 // This will error

	println("Hello $name $surname, your age is $age \nYour are a $type")
}
