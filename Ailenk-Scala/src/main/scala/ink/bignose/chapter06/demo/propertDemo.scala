package ink.bignose.chapter06.demo

object propertDemo {
  def main(args: Array[String]): Unit = {
    val p1= new Person
    println(p1.name)//null
    println(p1.address)//String

    var a =new A
    println(a.age1)
    println(a.age2)
    println(a.age3)
    println(a.age4)
  }

}

class Person {
  var age: Int = 10
  var sal = 8090.9 //给属性赋初值，省略类型，会自动推导
  var name = null // Name 是什么类型? 
  var address: String = null // address 是什么类型？ 
}

class A{
  var age1: String = _
  var age2: Int = _
  var age3: Double = _
  var age4: Boolean = _
}
