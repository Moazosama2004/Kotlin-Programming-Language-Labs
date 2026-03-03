package Lab2

class ByTwo : Number {
    override var start: Int = 0
    override var current: Int = 0

    override fun reset() {
        current = 0
        start = 0
    }

    override fun getNext(): Int {
        current += 2
        return current
    }
}