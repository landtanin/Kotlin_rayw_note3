
// we write constructor arguments to class just like that
class Person(var firstName: String) {

    var lastName: String? = null

    // second constructor
    constructor(firstName: String, lastName: String) : this(firstName) {
        this.lastName = lastName
    }


}

fun main(args: Array<String>) {

    val person = Person("Sam")
    val person2 = Person("Sam", "Gamgee")

}