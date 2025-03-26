package src.oop


class Interfaces {
	fun hello() {
		println("An interface is like a contract for behaviors, while an abstract class is a blueprint for similar objects with shared properties.")
		println("Use an interface when you want to define behavior (what something can do)." +
			"Use an abstract class when you want to define a base type (what something is).\n"
		)
		var modely = Tesla(name = "Model Y", colour = "White", numberOfWheels = 4)
		modely.startEngine()
		modely.drive()
	}
}

interface Engine {
	fun startEngine()
}

interface Wheels {
	val numberOfWheels: Int
	fun drive()
}

class intCar(val name: String, val colour: String): Engine {
	override fun startEngine() {
		println("Starting the car engine")
	}
}

class intTruck(val name: String, val colour: String): Engine {
	override fun startEngine() {
		println("Starting the truck engine")
	}
}

class intPlane(val name: String, val colour: String): Engine {
	override fun startEngine() {
		println("Starting the jets1234567890--")
	}
}

class Tesla(val name: String, val colour: String, override val numberOfWheels: Int): Engine, Wheels {
	override fun startEngine() {
		println("Push start button Tesla engine")
	}

	override fun drive() {
		println("The ${this.numberOfWheels} Wheels are moving")
	}
}
