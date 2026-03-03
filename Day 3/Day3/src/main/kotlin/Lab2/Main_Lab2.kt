package Lab2

fun main() {
    val byTwo = ByTwo()
    val byThree = ByThree()
    var ref: Number
    repeat(5) {
        ref = byTwo
        println("By Two : ${ref.getNext()}")
        ref = byThree
        println("By Three : ${ref.getNext()}")

        if(it == 4) {
            ref.reset()
            print(ref.current)
        }
    }



}