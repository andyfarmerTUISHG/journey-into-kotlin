package src

import src.oop.Calculator
import src.oop.Car
import src.oop.User
import src.oop.examples as oop
import src.learning.examples as learning


fun main() {
	enums()
}

fun enums() {
	terminalSplit("Enums")
	// A Fixed set of values
	// can have properties and funtions
	println(Direction.WEST)
	println(Direction.EAST)
	println(Direction.NORTH)
	println(Direction.SOUTH)

	println("Looping through enums as defined in the class")
	for (direction in Direction.values()) {
		println("Direction = $direction")
	}

	println("Display values from the enum")
	println("Direction = ${Direction.SOUTH.name}")
	println("Direction = ${Direction.SOUTH.direction}")
	println("Direction = ${Direction.SOUTH.distance}")
}

enum class Direction(var direction: String, var distance: Int) {
	NORTH(direction = "North", distance = 100),
	SOUTH(direction = "South", distance = 200),
	EAST(direction = "East", distance = 300),
	WEST(direction = "West", distance = 400)

}

fun lazyInitialisation() {
	terminalSplit("Lazy initialisation")
	// using user class
	val user1 = User("Andy", lastname = "Farmer", age = 48)
	val user2 = User("Riley", lastname = "Farmer", age = 18)
	// by using by lazy - the object is only created when it is called
	val user3Lazy by lazy {
		User("Brooke", lastname = "Farmer", age = 20)
	}
	println("Artifical block in user3Lazy 200")
	Thread.sleep(2000)
	println("My lazy user is ${user3Lazy.firstname}")
}

// Create a Singleton
object Database {
	// will be created the first time you call it
	init {
		println("Database Created")
	}
}

fun calculator() {
	terminalSplit("Calculator Class")
	println("Get Constanct from class - ${Calculator.intType}")
	println("Sum = ${Calculator.sum(2, 3)}")
	println("Subtract = ${Calculator.subtract(2, 3)}")
	println("Multiply = ${Calculator.multiply(2, 3)}")
	println("Divide = ${Calculator.divide(5, 2)}")
}

fun oopExamples() {

//	creatingCars()
	val user = User("Andy", lastname = "Farmer", age = 48)
	val user2 = User("Brooke", lastname = "Farmer", age = 20)
	val unknownUser = User("John")
	val unknownUser2 = User("Jane", lastname = "Doe")
	val userMiddle = User("Jack", "Steven", "Jacobs")

	user.favouriteMove = "The Matrix"

	println("${user.firstname}'s favourite move is ${user.favouriteMove}")
}

fun creatingCars() {
	// Instation of a car
	var car1 = Car(model = "Ford", name = "Fiesta", colour = "Candy Blue", doors = 5)

	println("Name = ${car1.name}")
	println("Name = ${car1.model}")
	println("Name = ${car1.colour}")
	println("Name = ${car1.doors}")

	car1.move()
	car1.stop()
}

fun learningCall() {
	println("Moved intial learning to learning class")
	val integerArray = arrayOf(150, 2, 4, 12, 14, 16, 6, 8, 10, 18, 20, 100, 1)
	learning.arrayChallenge(integerArray)
}


fun terminalSplit(terminalTitle: String) {
	println("\n---------\n$terminalTitle\n")
}
