package Lab2

class ByThree  : Number{
    override var start: Int = 0
    override var current: Int = 0

    override fun reset() {
         current = 0
        start = 0
    }

    override fun getNext(): Int {
        current += 3
        return current
    }
}