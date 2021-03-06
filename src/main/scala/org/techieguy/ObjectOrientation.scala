package org.techieguy

import scala.util.Try

object ObjectOrientation extends App {

  // class and instance
  class Animal {
    // define fields
    val age: Int = 0 // public by default, can restrict by adding protected or private
    def eat() = println("Love eating!")
  }
  val anAnimal = new Animal

  // inheritance
  class Dog(val name: String) extends Animal { // constructor definition

  }
  val aDog = new Dog("Alice")
  // constructor arguments are NOT fields: need to put a val before the constructor argument
  print(aDog.name)

  // subtype polymorphism
  val aDeclaredAnimal: Animal = new Dog("Helio")
  aDeclaredAnimal.eat() // the most derived method will be called at runtime

  // abstract class
  abstract class WalkingAnimal {
    val hasLegs = true
    def walk(): Unit
  }

  trait Carnivore {
    def eat(animal: Animal): Unit
  }

  trait Philosopher {
    def ?!(thought: String): Unit // valid method name
  }

  // single-class inheritance and multi-trait ("mixing")
  class Lion extends Animal with Carnivore with Philosopher {
    override def eat(animal: Animal): Unit = println("I'm eating don't bother me!")
    override def ?!(thought: String): Unit = println(s"I was walking: $thought")
  }

  val aLion = new Lion
  aLion.eat(aDog)
  aLion eat aDog // infix notation = object method argument, only available for method with ONE argument
  aLion ?! "What if we could fly"

  // operators in scala are actually methods
  val basicMath = 1 + 2
  val anotherBasicMath = 1.+(2) // equivalent to above line-51

  // anonymous classes
  val dinosaur = new Carnivore {
    override def eat(animal: Animal): Unit = println("I'm dinosaur, I can eat anything")
  }

  // Singleton object
  object Singleton {
    val myVal = 12345
    def myMethod() : Int = 43245

    def apply(x: Int): Int = x + 1
  }
  Singleton.myMethod()
  Singleton.apply(10)
  Singleton(10) //equivalent to Singleton.apply(10)

  object Animal { // companion objects
    // When object and class has same name they are called companions
    // Companions can access each other's private members of method/field
    // Singleton Animal and instances are different
    val canLiveInfinite = false
  }
  val animalCanLiveInfinite = Animal.canLiveInfinite

  /*
  * cases classes = lightweight data structure with some boilerplate code
  * - generate sensible equals and hashcode
  * - serialization
  * - companion with apply method
  * - used in pattern matching
  * */
  case class Person(name: String, age: Int)
  val bob = Person.apply("Bob", 23)
  val bobObject = Person("Bob", 23) // Equivalent to Person.apply("Bob", 23)

  // Exception
  try {
    val x: String = null
    x.length
  } catch {
    case e: Exception => "Some exception messages"
  } finally {
    // Executes no matter what
  }

  // Generics in scala
  abstract class MyList[T] {
    def head(): T
    def tail(): MyList[T]
  }

  val aList: List[Int] = List(1,2,3,4)  // List.apply(1,2,3,4)
  val head = aList.head
  val tail = aList.tail

  // Two important points to note here
  // Point #1: In Scala we usually operate with IMMUTABLE values/object
  // Any modification to an object must return ANOTHER object
  /*
  * Benefits:
  * 1 - Works as miracle in multithreaded/distributed environment
  * 2 - Helps making sense of the code
  * */
  val reverseList = aList.reverse // returns a new object/list

  // Point #2: Scala is closest to the OO ideal

}
