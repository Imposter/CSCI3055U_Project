import scala.collection.mutable._
import scala.io._
import scala.util._
import java.io._

val cards = List("A", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K")
val random = new Random()

var names = List[String]("", "")
var scores = List[Int](0, 0)

// Read player names
printf("Player 1 Enter your name: ")
names = names.updated(0, readLine())
printf("Player 2 Enter your name: ")
names = names.updated(1, readLine())

// Read the amount of rounds
printf("Enter the amount of rounds: ")
var numRounds = readInt()

var i = 0
for (i <- 0 to (numRounds - 1)) {
    // Ask for enter
    printf(s"Round ${i + 1}: Press ENTER to draw cards...", i)
    readLine()

    // Get a random card
    var n1 = random.nextInt(cards.length)
    var n2 = random.nextInt(cards.length)
    var c1 = cards(n1)
    var c2 = cards(n2)

    // Print and update score
    println(s"${names(0)} drew ${c1}")
    println(s"${names(1)} drew ${c2}")
    if (n1 > n2) {
        println(s"${names(0)} wins the round!")
        scores = scores.updated(0, scores(0) + 1)
    } else if (n2 > n1) {
        println(s"${names(1)} wins the round!")
        scores = scores.updated(1, scores(1) + 1)
    } else {
        println("It was a tie!")
    }
}

println(" ")
if (scores(0) > scores(1)) {
    println(s"${names(0)} wins!")
} else if (scores(1) > scores(0)) {
    println(s"${names(1)} wins!")
} else {
    println("The game was a tie!")
}

println(s"The final score was ${scores(0)}:${scores(1)}")