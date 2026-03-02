import kotlin.random.Random

/*
    Task 2 : ✅
    create an Array of integer.
    Use java.util.Random to fill the Array with 100 random
    number between 1 and 100.
    Go through collection and print values less than or equal
    to 10
*/


fun main () {
    var arrayOfIntergers = IntArray(100)

    repeat (arrayOfIntergers.size) {
        arrayOfIntergers[it] = Random.nextInt(100)
    }
    println("=============")


    var filteredList = arrayOfIntergers.filter {
        it <= 10
    }

    for (i in filteredList) {
       println(i)
    }
}