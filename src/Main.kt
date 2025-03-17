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
	terminalSplit("Int Options")
	numberOptions()
	terminalSplit("Float & Double Options")
	floatOptions()
	terminalSplit("CHAR Options")
	charOptions()
	terminalSplit("Sumamry of Data Types")
	dataTypesOptions()
	terminalSplit("Operators")
	operatorsDetails()
}

fun operatorsDetails(){
	var x = 5
	val y = 3.0
	//Operand are x & y
	val result = x + y
	println("Result = $result")
	println("As an Expression in a literal\nx + y = ${x +y}")
	println("x - y = ${x - y}")
	println("x * y = ${x * y}")
	println("x / y = ${x / y}")
	println("x % y = ${x % y}")

	//opearator assignment variable example
	var assignResult = x + y
	println("assignResult = $assignResult")
//	assignResult = assignResult + 2
	assignResult += 2
	println("assignResult + 2 = $assignResult")
//	assignResult = assignResult - 2
	assignResult -= 2
	println("assignResult - 2 = $assignResult")
//	assignResult = assignResult * 2
	assignResult *= 2
	println("assignResult * 2 = $assignResult")
//	assignResult = assignResult / 2
	assignResult /= 2
	println("assignResult / 2 = $assignResult")
//	assignResult = assignResult % 2
	assignResult %= 2
	println("assignResult % 2 = $assignResult")

	println("Operator Precedence")
	println("Multipliccation has precedence over addition $x + $y * 3 = ${x + y * 3}")
	println("Force addition precedence over multiplication ($x + $y) * 3 = ${(x + y) * 3}")

	println("Increment & Decrement $x")
	println("x++ print then increment = ${x++}")
	println("++x increment then print = ${++x}")
	println("x-- print then decrement = ${x--}")
	println("--x decrement then print = ${--x}")

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

	val myNumber = 28 // the default number inference is Int
	// If you want something else you must infer explicity
	// or, as a long
	var myNumberAsLong = 28L


}

fun floatOptions(){
	println("Used when needing more precision in your numbers")

	val myNumber = 3.141
	// Through type inference the default is a double
//	val myNumberAsFloat: Float = 3.141 // This errors, however if your want a float
	val myNumberAsFloat = 3.141f

	println("myName is a Double - $myNumber & myNumberAsFloat - $myNumberAsFloat")

}

fun charOptions(){
	val myCharValue: Char = 'D'
	val myBooleanValue: Boolean = true
	println("My Char Value (can only hold one character) = $myCharValue")
	println("My Boolean Value = $myBooleanValue")
}

fun dataTypesOptions(){
	println("8 Data Types")
	println("Byte")
	println("Short")
	println("Int")
	println("Long")
	println("Float")
	println("Double")
	println("Char")
	println("Boolean")
}

fun terminalSplit(terminalTitle: String ){
	println("\n---------\n$terminalTitle\n")
}
