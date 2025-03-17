package src

fun main() {
	println("Welcome to Main - Learning")
	println("Introducing Variables")
	// Define Variable and its type
	var name: String = "Andy"
	// can redefine
	name = "Riley"
	// if your declare as:
	val type = "person"
//	type = "cat" // this will error in the IDE
	// Integers
	var age: Int = 22

	// Kotlin has type inference so you don't have to infer type
	var surname = "Farmer"
//	surname = 2 // This will error

	println("Hello $name $surname, your age is $age \nYour are a $type")
	terminalSplit("Number Options")
	numberOptions()
}

fun numberOptions(){
	var number: Int = 22

	val maxIntegerVal: Int = Int.MAX_VALUE
	val minIntegerVal: Int = Int.MIN_VALUE

//	number = 2147483648 // this integer literal fails as greater than Int.MAX_VALUE

	println("Integers: \nInt Max = $maxIntegerVal")
	println("Int Min = $minIntegerVal")
	println(number)

	// Similar to Integers there are Bytes
	// This time we are going to use type inference
	val maxByteVal = Byte.MAX_VALUE
	val minByteVal = Byte.MIN_VALUE

	println("Bytes:\nByte Max =  $maxByteVal")
	println("Byte Min = $minByteVal")

	// This time we are going to use Short type inference
	val maxShortVal = Short.MAX_VALUE
	val minShortVal = Short.MIN_VALUE

	println("Short:\nShort Max =  $maxShortVal")
	println("Short Min = $minShortVal")

	// This time we are going to use Long type inference
	val maxLongVal = Long.MAX_VALUE
	val minLongVal = Long.MIN_VALUE

	println("Long:\nLong Max =  $maxLongVal")
	println("Long Min = $minLongVal")
}

fun terminalSplit(terminalTitle: String ){
	println("\n---------\n$terminalTitle\n")
}
