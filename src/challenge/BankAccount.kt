package src.challenge

class BankAccount(val name: String) {
	private val transactions = mutableListOf<Double>()
	private val balance: Double
		get() = transactions.sum()

	fun deposit(amount: Double) {
		if (amount > 0) {
			transactions.add(amount)
			println("Deposited: $$amount")
		} else {
			println("Deposit amount must be positive")
		}
	}

	fun withdraw(amount: Double) {
		if (amount > 0 && amount <= balance) {
			transactions.add(-amount)
			println("Withdrawn: $$amount")
		} else {
			println("Invalid withdrawal amount")
		}
	}

	fun calculateBalance(): Double {
		return balance
	}
}
