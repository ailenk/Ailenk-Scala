package ink.bignose.chapter01.vars

object varDemo1 {
  def main(args: Array[String]): Unit = {
    //编译器 动态的（逃逸分析）
    var age: Int = 10
    var sal: Double = 10.9
    var name: String = "Tom"
    var isPass: Boolean = true
    var scoreFloat: Float = 70.9f
    println("age=" + age)
    println("sal=" + sal)
    println("name=" + name)
    println("isPass=" + isPass)
    println("scoreFloat=" + scoreFloat)
  }

}
