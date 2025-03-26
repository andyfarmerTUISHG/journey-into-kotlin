package src

import src.challenge.BankAccount
import src.oop.*
import src.oop.examples as oop
import src.learning.examples as learning


fun main() {
	terminalSplit("Sealed Class")
	SealedClass().hello()

}


fun terminalSplit(terminalTitle: String) {
	println("\n---------\n$terminalTitle\n")
}
