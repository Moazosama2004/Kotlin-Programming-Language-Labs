/*
    Task 1 : ✅
    Use the readline() to read inputs from the user.
    User should input their name,
    if user enters empty string, store a default value.
    Use an if expression to define greeting
    message based on whether the user entered a name
*/


fun main () {
    print("enter your username : ")
    var name : String? = readLine()
    println(if (!name.isNullOrEmpty()) "Welcome ${name}"  else "no user name")
}