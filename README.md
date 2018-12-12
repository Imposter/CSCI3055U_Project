# _Scala (CSCI3055U Project)_

- _Eyaz Rehman_
- _eyaz.rehman@uoit.net_

## About the language

> _Scala is a modern imperative and declarative programming language. It is designed as a statically-typed language to express common patterns in an elegant and simple yet complex manner. It offers the best of both object-oriented and functional languages._
>
> History
> - Designed by Martin Odersky in 2001 while teaching at the Swiss Federal Institute of Technology in Lausanne, Switzerland
> - Internally released in 2003 as a prototype
> - Released publicly in 2004
> - Influenced by Martin's work on Java and Sun's Java compiler
>
> Features
> - Designed to compile to bytecode for the Java Virtual Machine, while also having a runtime for JavaScript
> - Functional programming
> - Similar syntax to Java and JavaScript
> - Works on the backend and frontend
> - Libraries available on Maven

## About the syntax

> _The syntax of Scala is quite elegant and simple_

*Declarations/definitions*
```scala
var x = 1 // Variable
val y = 2 // Constant

var x: Double = 5 // Explicit type specification
```

*Functions*
```scala
def multiply(x: Int) = { x * x } // With body
def pln(x: Any) = println(x) // Without braces
(1 to 10).map(10*) // Anonymous functions
```

*Packages*
```scala
import scala.collection._ // Wildcard import
import scala.collection.Vector // Specific import
import scala.collection.{ Vector, Sequence } // Selective import
import scala.collection.{ Vector => VecArray } // Renaming import

package mypackage // Declaring a package
```

*Data structures*
```scala
var list = List(1, 2, 3) // Lists
var n1 = list(1) // List indexing

1 :: List(2, 3) // Concatenate two list

1 to 5 // Range selection

(1, 2, 3) // Tuple literal
var (x, y, z) = (1, 2, 3) // Tuple unpacking
```

*Control constructs*
```scala
// Conditionals
if (statement) true_code else false_code
if (statement) { 
    // ...
} else if (other_statement) { 
    // ... 
} else {
    // ...
}

// While loop
while (x < 5) { 
    println(x)
    x += 1
}

// Do loop
do {
    println(x)
    x += 1
} while (x < 5)
```

*Object orientation*
```scala
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
```

## About the tools

### Scala Build Tool (SBT)

> sbt is a build tool for Scala, Java, and more.
>
> Features
> - Requires minimal configuration to set up a project
> - Build configuration files are written in Scala and allow the full functionality of Scala to be used
> - Incremental recompilation
> - Continuous compilation
> - Allows generation of documentation using scaladoc
> - Mix Java code with Scala
> - Supports Maven and other package systems
> - Git repositories as dependencies
x`
### Scala (Java Runtime)

> Ensure Java is installed
> Usage via command line:
> - `cd` to an empty folder.
> - Run the following command `sbt new scala/my-project.g8`. This pulls the 'my-project' template from GitHub
> - When prompted, enter the project name my-project. This will create a project called "my-project"
> - `cd` into `my-project`
> - Execute the command `sbt`, which will open the sbt console
> - Type `~run` which will build and execute the project in the current directory
>
> Or
> - `cd` into the directory containing the scala file
> - Use `scala <filename>` to execute the script

## About the standard library

> _The standard library provides some very useful functionality allowing interoperation between Java and Scala while also adding concurrency and additional features to data structures like Lists and Maps._
>
### List
> - Lists or Arrays are Immutable
> - Can be concurrent so they don't suffer from race conditions
> - Can have 0 to N amount of elements
> ```scala
> // Creating a list
> val animals = List("Dog", "Cat", "Hamster")
> val twoDimArray = List(List(1, 2, 3), List(4, 5, 6))
> ```
>
### Vector
> - Immutable
> - Can be concurrent so they don't suffer from race conditions
> ```scala
> // Creating a vector
> val animals = Vector[String]("Dog", "Cat", "Hamster")
> // Accessing 0th index
> println(animals(0))
> ```
>
### Map
> - Immutable
> - Can be concurrent so they don't suffer from race conditions
> ```scala
> // Creating a map
> val animals = scala.collection.mutable.HashMap.empty[String, String]
> animals += ("Mammal" -> "Dog")
> animals += ("Amphibian" -> "Gecko")
> ```

## About open source library

### Akka HTTP
> The Akka HTTP library implements a server and client HTTP stack utlizing the akka-actor and akka-stream libraries. It provides an easy to use HTTP interface to develop efficient applications easily.
>
> #### Features
> - Server
>   - Persistent connections
>   - Pipelining
>   - Asynchronous HTTP streaming using chunking
>   - SSL/TLS encryption
>   - WebSocket support
> - Client
>   - Full HTTP support
>   - Streaming connections
>   - SSL/TLS encryption
>   - WebSocket support

# Analysis of the language

### Functional tendencies
> While supporting simple procedural object oriented programming, Scala (being a superset of Java) also provides a wide range of features that are found only in functional programming languages. Altogether this allows programs to be written completely in a functional style.
>
> Some of the functional features are:
>
> - No distinction between statements and expressions
> - Dynamic type inference
> - Anonymous functions with capturing
> - Immutable objects and variables
> - Currying
> - Lazy evaluation
> - Higher-order functions
> - Nested functions
> - Pattern matching

### Meta-programming

> Since Scala 2.10, meta-programming has been a possibility with support for macros. Meta-programming allows a program to have information about itself, or allowing modification of itself. Macros allow code to be shortened as they can replace lengthy code used in numerous places and neaten the overall code

### Symbol resolution

> Symbol resolutions are a key part of the compilation process and involves the translation of named symbols into their locations in memory. The stages in this process are: identifying the symbols, segmenting them and then evaluating the actual address. Scala also takes advantage of symbol resolution.

### Scoping rules

> Scoping in Scala is generally lexical. Dynamic scoping is used with anonymous functions as variables in the anonymous function's scope are resolved at runtime. Lisp based languages are an example of exclusive dynamic scoping.

### Programming constructs / Standard library

> Scala has multiple STL functional programming constructs that are useful in coding practice. The first is Immutability; this keeps a variable static and you cannot change the value of the variable further in the code. Currying is another function that takes in multiple parameters and it returns a new function with only a single parameter. Pattern Matching is used to find keywords within a string. The keyword is passed into Pattern Matching as an argument and Pattern Matching returns if the pattern exists. Higher order functions are unique, as they take other normal functions in as parameters, or they return other normal functions. Lastly, Lazy programming is quite useful for shortening the length of your code and making it much more appealing and organized.

### Static vs Dynamic

> Scala as a language is statically typed where you need to define variables and there uses. In addition to this, Scala also uses type-inference to assist it in understanding missing information meaning unlike lower level languages such as C, you do not need to define and assign variables as strictly. For example, assigning (var a = 0) is possible, because of type-inference where in C, you would need to specifically tell the program (int x = 0;). In addition to being statically typed, and having type-inference Scala is also strongly typed. This means although you do not have to specifically name a variable when creating it, you cannot change variable types once they are created. For example; (a = "Changing this to a string from a 0 earlier").

### Pros and Cons

> Scala like any language has various pros and cons making it more suitable for certain applications. Since Scala is based on Java it shares many of the same pros and cons of that language
>
> Pros
> - Has support for Clojure
> - Can be used with Java and other Java software such as Android Studio, and even javascript
> - Type-inference and statically typed means theres less chance of errors while maintaining the freedom
> - Freedom extends to programming approaches, with the choice of Object-oriented and functional programming
> - Open source libraries growing and language slowly maturing
> - Can utilize Java's large library and functions
>
> Cons
> - Uses Java to run which is bad for performance. Lower level languages don't have this bottleneck for performance.
> - Still reduced support in open source and STL compared to established languages
> - Debugging is difficult due to lack of tools and software