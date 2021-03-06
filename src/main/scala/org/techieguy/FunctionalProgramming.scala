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

  // for comprehension
  val alternatePairs = for {
    number <- List(1,2,3)
    letter <- List('a', 'b', 'c')
  } yield s"$number-$letter"  // Equivalent to line-55 code
  println(alternatePairs)

  /*
  * Collections
  * */

  // List
  val aList = List(1,2,3,4)
  val firstElement = aList.head
  val restElement = aList.tail
  val aPrependList = 0 :: aList // List(0,1,2,3,4)
  val anExtendedList = 0 +: aList :+ 5  // List(0,1,2,3,4,5)

  // Sequence
  val aSequence: Seq[Int] = Seq(1,2,3,4)  // Seq.apply(1,2,3,4)
  val indexElement = aSequence(1) // aSequence.apply(1) -> 2

  // Vector: fast Seq implementations
  val aVector = Vector(1,2,3,4)

  // Sets = no duplicate records
  val aSet = Set(1,2,3,4,1,2) // Set(1,2,3,4)
  val setHas5 = aSet.contains(5)  // false
  val addedSet = aSet + 5 // Set(1,2,3,4,5)
  val removeSet = aSet - 2 // Set(1,3,4)

  // ranges
  val aRange = 1 to 1000
  val twoByTwo = aRange.map(x => 2 * x).toList  // List(2,4,6,8,...2000)

  // Tuple = groups of values under the same value
  val aTuple = ("Bon", "Rock", 1234)

  // Maps
  val aPhoneBook: Map[String, Int] = Map(("Roman", 1234), ("Larssi" -> 3456))

}
