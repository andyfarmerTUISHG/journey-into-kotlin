package src

fun main(){
	terminalSplit("Loops")
	loopDetails()
}
fun loopDetails(){
println("for loop")
	for(i in 1..10){
		println("I am looping i = $i")
	}
	println("until loop")
	for (i in 1 until 10){
		println("I am looping in an until i = $i")
	}
	println("downto loopcount backwards")
	for(i in 10 downTo 1){
		println("I am looping downwards i = $i")
	}
	println("step loop")
	for ( i in 1 until 12 step 2) {
		println("I am looping i = $i")
	}

}
fun mainFunctions(){
	val max = getMax(5,9)
	println("Max value is $max")
	val maxDouble = getMax(5.5,9.9)
	println("MaxDouble value is $maxDouble")
	val maxTripleInt = getMax(9,6,17)
	println("maxTripleInt value is $maxTripleInt")

	sendMessage("Alexa", "Hello")
	sendMessage("Alexa")
	sendMessage()
	sendMessage(message = "Named message")
	sendMessage(message = "Named message", name="Siri")

	println(sum(1,3,5,7))
	println("The sum function is restricted to 4 parameters, if the number of th parameters is unkown you can use vararg")
	println(sumVarArg(1,3,5,7,9,11))
}

fun sumVarArg(vararg numbers: Int):Int{
	var sum = 0
	for (number in numbers){
		sum += number
	}
	return sum
}

fun sum(a: Int, b: Int, c: Int, d: Int):Int {
	return a + b + c + d
}

fun sendMessage(name: String ="User", message: String = sendText()){
	println("$name and message =  $message")
}

fun sendText() = "Some default text from a function"

fun getMax(num1: Int, num2: Int):Int{
	return if(num1 > num2) num1 else num2
}
fun getMax(num1: Int, num2: Int, num3: Int):Int{
	if(num1 >= num2 && num1 >= num3){
		return num1
	} else if (num2 >= num1 && num2 >= num3){
		return num2
	} else {
		return num3
	}
}
fun getMax(num1: Double, num2: Double):Double{
	return if(num1 > num2) num1 else num2
}
fun mainDataTypes() {
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
	terminalSplit("Comments")
	commentsDetails()
	terminalSplit("If Else Example")
	ifelseDetails()
	terminalSplit("Combined Operator Example")
	combinedOperator()
	terminalSplit("Control Flow Example")
	controlFlow()
	terminalSplit("Null Example")
	nullExample()
}

fun nullExample(){
	var text: String? = null
	text = "Name"
//	println(text.length) // you cant use length on non null objects
	//check for null objects
	println(text?.length) // safe call
//	println(text!!.length) // create null pointer exception

	val text2 = text ?: "The variable is null"

	println(text2)
}
fun controlFlow(){
	val alarm = 7
	when (alarm){
		12, 7, 14 -> println("Wake Up - the time is $alarm")
//		7 -> println("Wake Up - the time is $alarm")
//		14 -> println("Wake Up - the time is $alarm")
		in 1..10 -> println("It is the range 1..10 $alarm")
		else -> println("Stay asleep Up - the time is $alarm")
	}
}

fun combinedOperator(){
	val isPlaying = true
	val score = 80
	if (isPlaying && score == 100) {
		println("Next Level Opened")
	} else {
		println("still at the same level")
	}
	println("OR Operator")
	val num1 = 0
	val num2 = 0
	if (num1 > 0 || num2 > 0) {
		println("At least one is greater than zero")
	} else {
		println("Both are less than zero")
	}
}

fun ifelseDetails(){
	val isActive = false
	if (isActive == true) {
		println("User is Active")
	} else {
		println("User is Inactive")
	}

	val grade = 54
	// greater than / less than operators short example
	// Currently Greater than >
	if (grade > 90) {
		println("You got a Distinction")
	} else  if (grade >= 70)	{
		println("You got a Merit")
	} else if (grade >= 50) {
		println("You got a pass")
	} else {
		println("You got a Fail")
	}

	// Ternary Operator
	val result = if (grade >= 50) "Pass" else "Fail"
	println("Your Result is $result")
}
fun commentsDetails(){
	println("Not going to see much here!!!")
	// End of line comment
	/*
		Multi line comment
	 */
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
