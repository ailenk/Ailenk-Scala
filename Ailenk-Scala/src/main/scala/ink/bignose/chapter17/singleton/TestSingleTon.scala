package ink.bignose.chapter17.singleton

/**
  * @Author :Ailenk
  * @Date: 2017/7/13 20:48
  */
object TestSingleTon extends App {
  val singleTon = SingleTon.getInstance
  val singleTon2 = SingleTon.getInstance
  println(singleTon.hashCode() + " " + singleTon2.hashCode())
}

//将SingleTon的构造方法私有化
class SingleTon private() {}

// 懒汉式
object SingleTon {
  private var s: SingleTon = null

  def getInstance = {
    if (s == null) {
      s = new SingleTon
    }
    s
  }
}
