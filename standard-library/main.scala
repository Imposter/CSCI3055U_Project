import scala.collection.mutable._
import java.io._

// Creating a list
val animals = List("Dog", "Cat", "Hamster")
val twoDimArray = List(List(1, 2, 3), List(4, 5, 6))

// Creating a vector
val animalsVec = Vector[String]("Dog", "Cat", "Hamster")
// Accessing 0th index
println(animalsVec(0))

// Creating a map
val animalsMap = HashMap.empty[String, String]
animalsMap += ("Mammal" -> "Dog")
animalsMap += ("Amphibian" -> "Gecko")

// Write a file
try {
    val writer = new BufferedWriter(new FileWriter(new File("example.txt")))
    writer.write("This is an example file of calling methods standard libraries from Scala")
    writer.close()
} catch {
    case ex: IOException => ex.printStackTrace();
}