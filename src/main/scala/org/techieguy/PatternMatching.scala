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
}
