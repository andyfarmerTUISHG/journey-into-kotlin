package src
import src.oop.Car
import src.oop.examples as oop
import src.learning.examples as learning


fun main(){
	oop.andy()
	creatingCars()
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
