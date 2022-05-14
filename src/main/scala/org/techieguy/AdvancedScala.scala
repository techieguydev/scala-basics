package org.techieguy

import scala.util.{Failure, Success, Try}

object AdvancedScala extends App {

  /**
  * Lazy evaluation: Not evaluate until it's used for first time
  * */
  lazy val lazyValue = 2
  lazy val lazyValWithSideEffect = {
    println("I'm in lazy block")
    50
  }
  val eager = lazyValWithSideEffect + 1
  // NOTE: Lazy evaluation is useful in infinite/huge collections

  /**
   * "pseudo-collections": Option, Try
   * */
  def dummyMethod(): String = "A dummy method"
  val anOption = Option(dummyMethod())  // If dummyMethod returns value -> Some("A dummy method") else None
  // Option = Collection which contains at least one value Some(value) or None

  // Pattern matching with Option
  val stringProcess = anOption match {
    case Some(value) => "Option got some values"
    case None => "Option got nothing"
  }

  //
  def methodCanThrowException(): String = throw new RuntimeException()
  try {
    methodCanThrowException()
  } catch {
    case e: Exception => "Devil caught, well done!"
  }
  // OR
  val aTry = Try(methodCanThrowException())
  // a try = "collection" with either a value if the code went well, or an exception if the code threw an exception
  println(aTry.failed)  // Returns success if exception occurred
  println(aTry.isFailure) // Returns true if exception occurred
  println(aTry.isSuccess) // Returns false is exception occurred

  val anotherStringProcess = aTry match {
    case Success(value) => "Got without exception"
    case Failure(exception) => s"Got some exception $exception"
  }
  println(anotherStringProcess)
}
