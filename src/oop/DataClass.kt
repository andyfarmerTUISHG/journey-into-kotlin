package src.oop

class DataClass {
	fun hello(){
		println("Data Classes")
//		queryEquality()
		val user1 = DCUser("Andy", "Farmer", 48)
		val user2 = DCUser("Andy", "Farmer", 48)
		val user3 = DCUser("Andy", "Farmer", 49)
		println("These do not match as objects")
		println("checking for structural equality\nuser1 == user2: ${user1 == user2} \nOnly because user1 and user2 have the same values, == returns true because we have overridden equals().")
		println("checking for structural equality\nuser1 == user3: ${user1 == user3}\n" +
			"this is the equavalient of user1.equals(user3)")

		println(user1)
		println(user2)
		println("check string version\nuser1.toString() == user2.toString(): ${user1.toString() == user2.toString()}")
		println("check string version\nuser1.toString() == user3.toString(): ${user1.toString() == user3.toString()}")

		println("There is a lot of code to verify the equality - but it is easier if your using data classes")
		println("\nData Class Example - add key infront of class name to make it a data class\n")
		val DCuser1 = DCUser2("Andy", "Farmer", 48)
		val DCuser2 = DCUser2("Andy", "Farmer", 48)
		val DCuser3 = DCUser2("Andy", "Farmer", 49)
		println("checking for structural equality\nDCuser1 == DCuser2: ${DCuser1 == DCuser2} \nOnly because DCuser1 and DCuser2 have the same values")
		println("checking for structural equality\nDCuser1 == DCuser3: ${DCuser1 == DCuser3}\n" +
			"this is the equavalient of user1.equals(user3)")

		println(DCuser1)
		println(DCuser2)
		println("check string version\nuser1.toString() == user2.toString(): ${DCuser1.toString() == DCuser2.toString()}")
		println("check string version\nuser1.toString() == user3.toString(): ${DCuser1.toString() == DCuser3.toString()}")



	}
}

fun queryEquality(){
	println("1. what is the difference between structure equality versus referential equality")

	val name1 = "Andy"
	val name2 = "Andy"

	val name3 = "Andy"
	val name4 = "Andrew"

	println("checking for structural equality\nname1 == name2: ${name1 == name2}")
	println("checking for structural equality\nname3 == name4: ${name3 == name4}")

	println("checking for referential equality\nname1 === name2: ${name1 === name1}")
	println("checking for referential equality\nname3 === name4: ${name1 === name2} - these are not the same object in memory")
}

data class DCUser2(val firstname: String, val lastname: String, val age: Int) {
	// Auto Generates your equals, hashCode and toString methods
}

class DCUser(val firstname: String, val lastname: String, val age: Int){
	override fun equals(other: Any?): Boolean {
		if(this === other)  {
			return true
		} // referential equality return super.equals(other)

		if(other is DCUser){
			//Only if the objects are of the same type
			return other.firstname == this.firstname &&
					other.lastname == this.lastname &&
					other.age == this.age
		}
		return false
	}
	// Note if you overide equals you must also overide hashCode
	// so it works correctly in hash-based collections (e.g., HashSet)
	override fun hashCode(): Int {
		// not required at this stage as a simple class
		return 0
	}

	override fun toString(): String {
		return "User(firstname=$firstname, lastname=$lastname, age=$age)"
	}
}
