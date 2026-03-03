class Person (
    val name: String,
    val address: Address
){

    data class Address(
        val streetName: String,
        val city: String,
        val building: Building,
    )

    override fun toString(): String {
        return "Person(name='$name', address=$address)"
    }


}