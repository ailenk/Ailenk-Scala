package ink.bignose.chapter18.convariant

/**
  * @Author :Ailenk
  * @Date: 2017/7/16 20:22
  */
object covariantcontravariant {
  def main(args: Array[String]): Unit = {
    val t: Temp3[Sub] = new Temp3[Sub]("hello world1")//不变
    val t4: Temp4[Super] = new Temp4[Sub]("hello world1")//协变
    val t5: Temp5[Sub] = new Temp5[Super]("hello world1")//逆变
    // 没有关系
//    val t: Temp3[Super] = new Temp3[Sub]("hello world1")
//    val t: Temp3[Sub] = new Temp3[Super]("hello world1")
    }

}

class Temp5[-A](title: String) { //Temp3[+A] //Temp[-A]
  override def toString: String = {
    title
  }
}

class Temp4[+A](title: String) { //Temp3[+A] //Temp[-A]
  override def toString: String = {
    title
  }
}

class Temp3[A](title: String) { //Temp3[+A] //Temp[-A]
  override def toString: String = {
    title
  }
}
//支持协变
class Super

//Sub 是super的子类
class Sub extends Super
