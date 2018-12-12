/**
 * Packages
 */
// Declaring a package
// package basic-syntax

// Importing packages
//import scala.collection._ // Wildcard import
//import scala.collection.Vector // Specific import
//import scala.collection.{ Vector, Sequence } // Selective import
//import scala.collection.{ Vector => VecArray } // Renaming import

/**
 * Declarations/definitions
 */
var x = 1 // Variable
val y = 2 // Constant

var z: Double = 5 // Explicit type specification

/**
 * Functions
 */
def multiply(x: Int) = { x * x } // With body
def pln(x: Any) = println(x) // Without braces
(1 to 10).map(10*) // Anonymous functions

/**
 * Data structures
 */
var list = List(1, 2, 3) // Lists
var n1 = list(1) // List indexing

1 :: List(2, 3) // Concatenate two list

1 to 5 // Range selection

(1, 2, 3) // Tuple literal
var (q, r, s) = (1, 2, 3) // Tuple unpacking

/**
 * Control constructs
 */
// Conditionals
if (q == 1) println("q == 1 ? True") else println("q == 1 ? False")
if (q == 2) { 
    println("Will never execute")
} else if (s == 3) { 
    println("s == 3!")
} else {
    println("Will never execute")
}

// While loop
x = 0
while (x < 5) { 
    println("While Loop: " + x)
    x += 1
}

// Do loop
x = 0
do {
    println(x)
    x += 1
} while (x < 5)

/**
 * Object orientation
 */
class Animal {
    // Private declarations
    private var _species = ""

    // Define constructor
    def this(species: String) {
        this() // Call base constructor
        this._species = species
    }

    // Define getters and setters
    def species = _species
    def species_= (s: String) = { // NOTE: There must be no space between the _ and = for the setter
        _species = s
    }
}

var animal = new Animal("Dog")
println(animal.species)