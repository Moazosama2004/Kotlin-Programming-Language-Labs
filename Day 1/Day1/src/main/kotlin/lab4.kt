/*
    Task 4 : ✅
    Receive the first name and last name from user using readLine()
    then print
    the full name
*/
fun main () {
    print("enter first name : ")
    val firstName = readLine() ?: ""
    print("enter last name : ")
    val lastName = readLine() ?: ""

    println("$firstName $lastName")

}