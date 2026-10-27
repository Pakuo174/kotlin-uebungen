package v2_functions

// main() muss top-level stehen (nicht in einer Klasse), damit sie ausführbar ist
fun main() {
    birthdayGreeting1()

    val greeting = birthdayGreeting2()
    println(greeting)

    println(birthdayGreeting3("Timmy", 10))
    println(birthdayGreeting3("Rex", 17))
}

// no return value with UNIT as return type
fun birthdayGreeting1(): Unit {
    println("Happy Birthday, Rover!")
    println("You are now 5 years old!\n")
}

// with return of a string
fun birthdayGreeting2(): String {
    val nameGreeting = "Happy Birthday, Simon!"
    val ageGreeting = "You are now 25 years old!"
    return "$nameGreeting\n$ageGreeting\n"
}

// add parameters
fun birthdayGreeting3(name: String, age: Int): String {
    val nameGreeting = "Happy Birthday, $name!"
    val ageGreeting = "You are now $age years old!"
    return "$nameGreeting\n$ageGreeting"
}
