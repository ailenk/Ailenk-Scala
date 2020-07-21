package ink.bignose.chapter18.viewbounds

/**
  * @Author :Ailenk
  * @Date: 2017/7/16 19:39
  */
object ViewBoundsDemo02 {
  def main(args: Array[String]): Unit = {
    // 隐式将Student -> Ordered[Person2]//放在object MyImplicit 中
    implicit def person22OrderedPerson2(person: Person2) = new Ordered[Person2]{
      override def compare(that: Person2): Int = person.age - that.age
    }

    val p1 = new Person2("tom", 110)
    val p2 = new Person2("jack", 20)

    val compareComm3 = new CompareComm2(p1, p2)
    println(compareComm3.getter)
  }
}


class Person2(val name: String, val age: Int)  {
  override def toString = this.name + "\t" + this.age
}
class CompareComm3[T <% Ordered[T]](obj1: T, obj2: T) {
  def geater = if (obj1 > obj2) obj1 else obj2
}

class Person(val name: String, val age: Int) extends Ordered[Person] {
  override def compare(that: Person): Int = this.age - that.age
  override def toString: String = this.name + "\t" + this.age}


class CompareComm2[T <% Ordered[T]](obj1: T, obj2: T) {
  def getter = if (obj1 > obj2) obj1 else obj2
  def geatter2 = if (obj1.compareTo(obj2) > 0) obj1 else obj2
}
