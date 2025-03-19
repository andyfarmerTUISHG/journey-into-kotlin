package src.oop

class Car(//properties of a car
	var name: String,
	var model: String,
	var colour:String,
	var doors: Int) {


	fun move(){
		println("Car $name $model is moving")
	}

	fun stop(){
		println("The car $name $model has stopped")
	}
}
