fun main(args: Array<String>) {

    val address = Person.Address("Haram Street" , "Giza" , Building.VILLA)
    val person = Person(name = "Muaz Osama" , address = address)

    println(person)
}
