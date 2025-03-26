package src.oop

class SealedClass{
	fun hello(){
		println("Hello")

		val success = Result.Success("Success")
		val error = Result.Error("Error")
		val warning = Result.Error("WARNING!")

		getData(success)
		getData(error)
		getData(warning)
	}
}

fun getData(result: Result){
	when(result){
		is Result.Error -> result.showMessage()
		is Result.Success -> result.showMessage()
		is Result.Warning -> TODO()
	}
}

sealed class Result(val message: String){
	fun showMessage() = println("Result: $message")
	class Success(message: String): Result(message)
	class Error(message: String): Result(message)
	class Warning(message: String): Result(message)
}
