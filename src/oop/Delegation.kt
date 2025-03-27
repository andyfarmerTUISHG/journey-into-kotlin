package src.oop

import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class Delegation {
	fun hello(){
		println("Delegation")
		println("Delegation is usually used in in scenarios where inheritance starts to break")
		println("with inheritance you can you inherit just from only one class")
		println("but with delegation you can inherit from multiple classes")

		val user = UserFD()
		with(user){
			name = "AnDy"
			surname = "FarMer"
		}

		with(user){
			println("$name")
			println("$surname")
		}
	}
}

class UserFD{
	var name by FormatDelegate()
	var surname by FormatDelegate()

}

class FormatDelegate : ReadWriteProperty<Any?, String> {
	private var formattedString: String = ""

	override fun getValue(
		thisRef: Any?,
		property: KProperty<*>):String {
		return formattedString
	}

	override fun setValue(
		thisRef: Any?,
		property: KProperty<*>,
		value: String) {
		formattedString = value.lowercase()
	}

}
