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


}
