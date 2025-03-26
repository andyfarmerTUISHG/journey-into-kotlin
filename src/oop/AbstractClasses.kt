package src.oop

class AbstractClasses {
	open fun hello(){
		println("Note: You can only create an instance of an abstract class")
		println("This is a blueprint, you must implement the missing parts.")
		var ford = AbstractCar(name = "Fiesta", colour = "Candy Blue", engines = 1, doors = 5)
		ford.move()

	}
}

abstract class AbstractVehicle() {
	//
	abstract fun move()

	abstract fun stop()
}

class AbstractCar(var name: String, var colour: String, val engines: Int, val doors: Int) : AbstractVehicle() {
	override fun move() {
		println("$name is driving")
	}

	override fun stop() {
		println("$name has stopped")
	}

}
