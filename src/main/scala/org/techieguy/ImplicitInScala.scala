package org.techieguy

object ImplicitInScala extends App {

  /**
   * Implicits basics
   * */

  // implicit arguments
  def aMethodWithImplicitArgs(implicit num: Int) = num + 10
  implicit val aNum = 10
  println(aMethodWithImplicitArgs)  // aMethodWithImplicitArgs(aNum)

  // implicit conversions
  implicit class IntegerWrapper(num: Int) {
    def isEven(): Boolean = num % 2 == 0
  }
  println(23.isEven())  // new IntegerWrapper(23).isEven()

  //NOTE: use it carefully

  val test = math floor(3.123) * 2
  println(test)
}
