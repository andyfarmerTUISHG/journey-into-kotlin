package src

import src.challenge.BankAccount
import src.oop.*
import src.oop.examples as oop
import src.learning.examples as learning


fun main() {
	terminalSplit("inheritance check")
	Inheritance().hello()
	terminalSplit("Abstract Class")
	AbstractClasses().hello()

}


fun terminalSplit(terminalTitle: String) {
	println("\n---------\n$terminalTitle\n")
}
