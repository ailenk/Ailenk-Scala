package ink.bignose.chapter17.singleton

/**
  * @Author :Ailenk
  * @Date: 2017/7/13 20:50
  */
object TestSingleTon2 extends App {
  val singleTon = SingleTon2.getInstance
  val singleTon2 = SingleTon2.getInstance
  println(singleTon.hashCode() + " ~ " + singleTon2.hashCode())
  println(singleTon == singleTon2)
}

//将SingleTon的构造方法私有化
class SingleTon2 private() {
  println("~~~")
}

object SingleTon2 {
  private val s: SingleTon2 = new SingleTon2

  def getInstance = {
    s
  }
}

//说明：饿汉式
