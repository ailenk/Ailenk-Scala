package ink.bignose.chapter06.method

object dogcase {

  def main(args: Array[String]): Unit = {

    var dog = new Dog2
    dog.name = "111"
    dog.age = 0
    dog.weight = 12.5
   println(dog.say())
  }

}

class Dog2 {
  var name = ""
  var age = 0
  var weight = 0.0

  def say(): String = {
    "小狗信息:" + name + age + weight
  }
}
