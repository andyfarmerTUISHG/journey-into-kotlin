package src.oop

class Inheritance {
}

open class Vehicle(val name: String, val model: String, val colour: String, val engines: Int, val doors: Int) {
	open fun move(){
		println("$name is moving")
	}

	open fun stop(){
		println("$name  has stopped")
	}
}

class Plane(name: String, model: String, colour:  String, engines: Int, doors: Int, val wings: Int) : Vehicle(name, model, colour, engines, doors) {
	override fun move() {
		flying()
		// Call the base class method as it is
		super.move()
	}
	override fun stop() {
		landing()
		// Call the base class method as it is
		super.move()
	}
	fun flying(){
		println("$name is taking off")
	}
	fun landing(){
		println("$name is taking off")
	}
}

class Automobile(name: String, model: String, colour: String, engines: Int, doors: Int, val wheels: Int) : Vehicle(name, model, colour, engines, doors) {
	//overide simple method
	override fun move() {
		println("$name is driving")
	}
}
