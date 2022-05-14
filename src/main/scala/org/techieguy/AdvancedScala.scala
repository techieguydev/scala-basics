package org.techieguy

object AdvancedScala extends App {

  // Lazy evaluation: Not evaluate until it's used for first time
  lazy val lazyValue = 2
  lazy val lazyValWithSideEffect = {
    println("I'm in lazy block")
    50
  }
  val eager = lazyValWithSideEffect + 1
  // NOTE: Lazy evaluation is useful in infinite/huge collections

  // "pseudo-collections": Option, Try
  def dummyMethod(): String = "A dummy method"
  val anOption = Option(dummyMethod())  // If dummyMethod returns value -> Some("A dummy method") else None
  // Option = Collection which contains at least one value Some(value) or None

  // Pattern matching with Option
  val stringProcess = anOption match {
    case Some(value) => "Option got some values"
    case None => "Option got nothing"
  }


}
