package org.techieguy

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

  trait Philoshopher {
    def ?!(thought: String): Unit // valid method name
  }

  // single-class inheritance and multi-trait ("mixing")
  class Lion extends Animal with Carnivore with Philoshopher {
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




}
