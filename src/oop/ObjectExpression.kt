package src.oop

class ObjectExpression {
	fun hello() {
		println("Object Expression")


		// User an anonymous function / object expression -
		// keeps the code clean and adhere to inheritance
		val loginButton = Button("Login", 1, object : OnClickListener {
			override fun onClick() {
				println("Login Button Clicked")
			}
		})
		val signupButton = Button("Signup", 2, object : OnClickListener {
			override fun onClick() {
				println("Signup Button Clicked")
			}
		})
	}
}

interface OnClickListener {
	fun onClick()
}

class Button(val text: String, val id: Int, onClickListener: OnClickListener) {

}

class ClickListener() : OnClickListener {
	override fun onClick() {
		println("Button Clicked")
	}
}
