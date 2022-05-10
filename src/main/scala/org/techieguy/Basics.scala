package org.techieguy

object Basics extends App {
  // defining a value
  val age: Int = 33

  // type is optional in Scala
  val aBoolean = false
  val gender = "M"

  // Strings and string operation
  val fName: String = "Avin"
  val lName: String = "Rale"
  val fullName: String = "Welcome! " + fName + " " + lName
  println(fullName)
  println(s"Welcome! $fName $lName")

  // expressions = structures that can be reduced to a value
  val anExpression = 2 + 3
  // if-expression
  val ifExpression = if (age > 30) "Old enough" else "Still young"

  // code blocks
  val codeBlock = {
    val codeBlockVal = 47
    codeBlockVal + 3 // last expression considered as return expression in Scala
  }

  // defining a function
  def myFunction(x: Int, y:Int): String = {
    x + " " + y
  }

  // The Unit type = no meaningful value, similar to void in other languages
  def noMeaningFul(): Unit = {
    println("Returns nothing")
  }
}
