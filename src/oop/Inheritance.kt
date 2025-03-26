package src.oop

class Inheritance {
	open fun hello(){
		val ford = Automobile(model = "Ford", name = "Fiesta", colour = "Candy Blue", engines = 1, doors = 5, wheels = 4)

		println("Name = ${ford.name}")
		ford.move()
		ford.stop()

		val cesna = Plane(model = "Cessna", name = "Cessna 172", colour = "White", doors = 2,engines = 2,  wings = 2)
		cesna.move()
		cesna.stop()

		var kawasaki = Motorbike(model = "fast one", name = "Kawasaki", colour = "Red", engines = 1, doors = 0)
		kawasaki.move()
	}
}

open class Vehicle(val name: String, val model: String, val colour: String, val engines: Int, val doors: Int) {
	open fun move(){
		println("$name is moving")
	}

	open fun stop(){
		println("$name  has stopped")
	}
}

class Motorbike(name: String, model: String, colour: String, engines: Int, doors: Int) : Vehicle(name, model, colour, engines, doors){

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
