package v1_variables

/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */
fun main() {

    val hase : Int = 10
    val wolf : Int = 5
    println("There are $hase bunnys in the house")
    println("Hase und Wolf zusammen = ${hase + wolf}")

    var katzencounter = 0
    println("Katzen im Haus am Montag = $katzencounter")

    // neues Zuweisen -> wichtig ist var nicht val
    katzencounter = 2
    println("Katzen im Haus am Freitag = $katzencounter")
    katzencounter = katzencounter + 1							 // +1
    katzencounter ++											 // +1
    katzencounter -- 											 // -1
    println("Katzen im Haus am Samstag = $katzencounter")



    // ________ andere Datentypen : Double ________
    println("")

    val trip1: Double = 3.20
    val trip2: Double = 4.10
    val trip3: Double = 1.72
    val totalTripLength: Double = trip1 + trip2 + trip3
    println("$totalTripLength miles left to destination")

    // ________  String ________
    println("")


    val nextMeeting = "Next meeting:"
    val date = "January 1"
    val reminder = nextMeeting + date
    println(reminder)

    // ______ Boolean ____
    println("")
    val notificationsEnabled: Boolean = false
    println("Are notifications enabled? " + notificationsEnabled)

    /*
 	* This is a very long comment that can
 	* take up multiple lines.
 	*/

}