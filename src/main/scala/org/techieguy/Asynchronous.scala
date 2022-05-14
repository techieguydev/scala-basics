package org.techieguy

import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global

/**
 * Evaluate something on another thread
 * (Asynchronous programming)
 * */
object Asynchronous extends App {

  val aFuture = Future({
    println("Loading...")
    Thread.sleep(1000)
    println("I have computed a value")
  })
  Thread.sleep(2000)
  // Future is a "collection" which contains a value when it's evaluated
  // Future is composable with map flatMap and filter

}
