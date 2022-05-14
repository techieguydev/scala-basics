package org.techieguy

object AdvancedScala extends App {

  // Lazy evaluation: Not evaluate until it's used for first time
  lazy val lazyValue = 2
  lazy val lazyValWithSideEffect = {
    println("I'm in lazy block")
    50
  }
  val eager = lazyValWithSideEffect + 1
}
