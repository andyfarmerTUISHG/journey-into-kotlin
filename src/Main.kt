package src

import src.challenge.BankAccount
import src.oop.Calculator
import src.oop.Car
import src.oop.User
import src.oop.examples as oop
import src.learning.examples as learning


fun main() {
	val andyAccount = BankAccount("Andy")
	andyAccount.deposit(100.0)
//	println("Andy's Account has ${andyAccount.calculateBalance()}")
	andyAccount.withdraw(50.0)
	andyAccount.deposit(100.0)
//	println("Account ${andyAccount.name} has a balance of ${andyAccount.balance}") //andyAccount.balance
	val andyBalance = andyAccount.calculateBalance()
	println("Account ${andyAccount.name} has a balance of ${andyBalance}")
}


fun terminalSplit(terminalTitle: String) {
	println("\n---------\n$terminalTitle\n")
}
