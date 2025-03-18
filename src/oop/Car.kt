package src.oop

class Car {
	//properties of a car
	var name = ""
	var model = ""
	var colour = ""
	var doors = 0

	fun move(){
		println("Car $name $model is moving")
	}

	fun stop(){
		println("The car $name $model has stopped")
	}
}
