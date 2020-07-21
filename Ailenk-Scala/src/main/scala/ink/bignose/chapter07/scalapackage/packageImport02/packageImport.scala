package ink.bignose.chapter07.scalapackage.packageImport02

//再sacla 中包 scala 包 ， lang. Predef 包

class Manager(var name: String) {
  //第一种形式
  //@BeanProperty var age: Int = _
  //第二种形式, 和第一种一样，都是相对路径引入
  //@scala.beans.BeanProperty var age: Int = _
  //第三种形式, 是绝对路径引入，可以解决包名冲突
  @_root_.scala.beans.BeanProperty var age: Int = _
}

object TestBean {
  def main(args: Array[String]): Unit = {
    val m = new Manager("jack")
    println("m=" + m)
  }
}

