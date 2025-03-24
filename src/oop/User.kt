package src.oop

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

// You can specify default values in the original constructor
class User(
	var firstname: String,
	var middleName: String =  "",
	var lastname: String = "LastName",
	var age: Int = 0
) {
	val createTimeFormat = DateTimeFormatter.ofPattern("HH:mm:ss:ms - yyyy-MM-dd")
	// As part of lazyinitialization
	init {
		println ("User: $firstname was created @ ${LocalDateTime.now().format(createTimeFormat)}")
	}

	// for a value not set at point of contruction
	// you can use lateinit
	lateinit var favouriteMove: String
	// lateint cannot be used for primitive data types, Boolean or Char

	//Secondary Constructors - you can have multiple
//	constructor(firstname:String) : this(firstname, "User-Lastname", 0)
//	constructor(name: String, lastname: String) : this(name, lastname, 0){
//		println("3rd constructor used")
//	}

}
