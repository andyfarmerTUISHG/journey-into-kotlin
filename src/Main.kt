package src
import src.oop.Calculator
import src.oop.Car
import src.oop.User
import src.oop.examples as oop
import src.learning.examples as learning


fun main(){
	terminalSplit("Singleton")
	terminalSplit("Singleton")
	// Ensure you only have 1 instance of an object across the application
	// ie one datatbase
	val instance = Database.getInstance()
	// Settings another - you still have the same
	val instance2 = Database.getInstance()
	println(instance)
	println(instance2)



}

/*
 Old way of creating a Singleton
 */
class Database private constructor(){
	companion object {
		private var instance: Database? = null

		fun getInstance(): Database? {
			if ( instance == null) {
				instance = Database()
			}

			return instance

		}
	}
}

fun calculator(){
	terminalSplit("Calculator Class")
	println("Get Constanct from class - ${Calculator.intType}")
	println("Sum = ${Calculator.sum(2,3)}")
	println("Subtract = ${Calculator.subtract(2,3)}")
	println("Multiply = ${Calculator.multiply(2,3)}")
	println("Divide = ${Calculator.divide(5,2)}")
}
fun oopExamples() {

//	creatingCars()
	val user = User("Andy", lastname = "Farmer" , age = 48)
	val user2 = User("Brooke",  lastname = "Farmer", age = 20)
	val unknownUser = User("John")
	val unknownUser2 = User("Jane", lastname = "Doe")
	val userMiddle = User("Jack","Steven" , "Jacobs")

	user.favouriteMove = "The Matrix"

	println("${user.firstname}'s favourite move is ${user.favouriteMove}")
}
fun creatingCars(){
	// Instation of a car
	var car1 = Car(model = "Ford", name = "Fiesta" , colour ="Candy Blue" ,doors= 5)

	println("Name = ${car1.name}")
	println("Name = ${car1.model}")
	println("Name = ${car1.colour}")
	println("Name = ${car1.doors}")

	car1.move()
	car1.stop()
}

fun learningCall() {
	println("Moved intial learning to learning class")
	val integerArray = arrayOf(150,2,4,12,14,16,6,8,10,18,20,100,1)
	learning.arrayChallenge(integerArray)
}



fun terminalSplit(terminalTitle: String) {
	println("\n---------\n$terminalTitle\n")
}
