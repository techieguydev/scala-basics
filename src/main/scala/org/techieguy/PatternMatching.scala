package org.techieguy

object PatternMatching extends App {

  // Switch expression
  val anInteger = 55
  val order = anInteger match {
    case 1 => "First"
    case 2 => "Second"
    case 3 => "Third"
    case _ => anInteger + "th"
  }
  println(order)

  case class Person(name: String, age: Int)
  val bob = Person("Bob", 44) // Person.apply("Bob", 44)

  val personGreeting = bob match {
    case Person(name, age) => s"Hi, I'm $name and I'm $age years old"
    case _ => "Something else"
  }
  println(personGreeting)

  // Tuple matching
  val aTuple = ("Bob", "Rock")
  val tupleMatching = aTuple match {
    case (fname, lname) => s"Hi $fname $lname, welcome to Scala"
    case _ => "Anything else"
  }
  println(tupleMatching)

  // Decomposing List
  val aList = List(1,2,3)
  val aListMatching = aList match {
    case List(_, 2, _) => "Number 2 founf in the middle"
    case _ => "Something else"  // If we don't write anything else, we will get exception MatchError
  }
  println(aListMatching)
}
