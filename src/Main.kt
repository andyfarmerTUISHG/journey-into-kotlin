package src
import src.oop.Car
import src.oop.User
import src.oop.examples as oop
import src.learning.examples as learning


fun main(){
	oop.andy()
//	creatingCars()
	val user = User("Andy", "Farmer" , 48)
	val user2 = User("Brooke", "Farmer", 20)
	val unknownUser = User("John")
	val unknownUser2 = User("Jane", "Doe")
	println("Name of user1 ${user.name}\nName of user2 ${user2.name}")
	println("Unknown User created with a secoondary constructor")
	println("${unknownUser.name} ${unknownUser.lastname} ${unknownUser.age}")
	println("${unknownUser2.name} ${unknownUser2.lastname} ${unknownUser2.age}")
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
