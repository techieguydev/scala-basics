package org.techieguy

object ObjectOrientation extends App {

  // class and instance
  class Animal {
    // define fields
    val age: Int = 0
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

}
