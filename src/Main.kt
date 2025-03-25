package src

import src.challenge.BankAccount
import src.oop.Calculator
import src.oop.Car
import src.oop.Automobile
import src.oop.Plane
import src.oop.User
import src.oop.examples as oop
import src.learning.examples as learning


fun main() {
	terminalSplit("Inheritance")
	val ford = Automobile(model = "Ford", name = "Fiesta", colour = "Candy Blue", engines = 1, doors = 5, wheels = 4)

	println("Name = ${ford.name}")
	ford.move()
	ford.stop()

	val cesna = Plane(model = "Cessna", name = "Cessna 172", colour = "White", doors = 2,engines = 2,  wings = 2)
	cesna.move()
	cesna.stop()
}


fun terminalSplit(terminalTitle: String) {
	println("\n---------\n$terminalTitle\n")
}
