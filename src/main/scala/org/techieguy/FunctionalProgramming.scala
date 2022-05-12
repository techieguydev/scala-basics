package org.techieguy

object FunctionalProgramming extends App {

  // Scala is Object Oriented
  class Person(name: String) {
    def apply(age: Int): Unit = println("Scala is object oriented language")
  }

  val bob = new Person("Bob")
  bob.apply(20)
  bob(20) // INVOKING bob as a function === bob.apply(20)

  /*
  * Scala runs on JVM
  * Functional Programming: To make Scala functional aspect into object, Scala treats every method as first class citizen
  * - Compose functions
  * - Pass functions as arguments
  * - Return functions as results
  *
  * Conclusion: FunctionX = Function1, Function2, ... Function22
  * */

  val simpleIncrementor = new Function1[Int, Int] {
    override def apply(val1: Int): Int = val1 + 1
  }
  simpleIncrementor.apply(25) // Output 26
  simpleIncrementor(25)

  // Sugar syntax
  val doubler1: Int => Int = (x: Int) => x + 10
  val doubler: Function1[Int, Int] = (x: Int) => x + 10 //Can be written as -> val doubler = x => x.+(10)
  doubler(10) // Output: 20

  /*
  * Equivalent to much larger code below
  *
  * val doubler: Function1[Int, Int] = new Function1[Int, Int] {
  *   override def apply(x: Int): Int = x + 10
  * }
  * */

  // Higher Order Function: A method which takes functions as argument and returns functions as result
  // Higher Order Function - HOF
  val multiplier = List(1,2,3,4).map(x => x * 2)  // val multiplier = List(1,2,3,4).map(_ * 2)
  println(multiplier)
  val flatMapList = List(1,2,3).flatMap(x => List(x, x + 2))
  println(flatMapList)

  // Filters
  val filteredList = List(1,2,3,4).filter(x => x <= 3)
  println(filteredList)

  // All pairs between the number 1,2,3 and the letters a, b, c - Chain of functions
  val allPairs = List(1,2,3).flatMap(number => List('a', 'b', 'c').map(letter => s"$number-$letter"))
  println(allPairs)

}
