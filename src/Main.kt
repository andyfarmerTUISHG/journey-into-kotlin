package src
import src.oop.examples as oop
import src.learning.examples as learning

fun main(){
	oop.andy()
	learningCall()
}

fun learningCall() {
	println("Moved intial learning to learning class")
	val integerArray = arrayOf(150,2,4,12,14,16,6,8,10,18,20,100,1)
	learning.arrayChallenge(integerArray)
}



fun terminalSplit(terminalTitle: String) {
	println("\n---------\n$terminalTitle\n")
}
