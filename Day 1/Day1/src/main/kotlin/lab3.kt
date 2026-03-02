
/*
    Task 3 : ✅
    Calculator: ADD, SUB, MUL, DIV`
*/
fun main () {
    print("enter first number : ")
    var number1 : Double = readLine()?.toDouble() ?: 0.0
    print("enter second number : ")
    var number2 : Double = readLine()?.toDouble() ?: 0.0
    print("enter your operator you want")
    var operator : String? = readLine()
    var result : Double
    when(operator) {
        "+" -> {
            result = number1 + number2
            println("$number1 $operator $number2 = $result")
        }
        "-" -> {
            result = number1 - number2
            println("$number1 $operator $number2 = $result")
        }
        "*" -> {
            result = number1 * number2
            println("$number1 $operator $number2 = $result")
        }
        "/" -> {
            when(number2) {
                0.0 ->  println("Can't divide by Zero please retry division procees with valid number.")
                else ->  {
                    result = number1 / number2
                    println("$number1 $operator $number2 = $result")
                }
            }
        }
        else  -> println("Please Enter A valid operator")
    }
}