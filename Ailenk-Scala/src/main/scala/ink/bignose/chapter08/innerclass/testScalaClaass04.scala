package ink.bignose.chapter08.innerclass

object testScalaClaass01 {
  def main(args: Array[String]): Unit = {
    val outer1: ScalaOuterClass = new ScalaOuterClass()
    val outer2: ScalaOuterClass = new ScalaOuterClass()

    var inner1 = new outer1.ScalaInnerClass
    var inner2 = new outer2.ScalaInnerClass

    inner1.info()
    inner1.test(inner1)

//    inner2.info()
//    inner2.test(outer2)  //内部类关联 创建的外部类

  }
}


class ScalaOuterClass {

  myout =>
  class ScalaInnerClass { //成员内部类
    def info() = {
      // 访问方式：外部类名.this.属性名
      // 怎么理解 ScalaOuterClass.this 就相当于是 ScalaOuterClass 这个外部类的一个实例,
      // 然后通过 ScalaOuterClass.this 实例对象去访问 name 属性
      // 只是这种写法比较特别，学习java的同学可能更容易理解 ScalaOuterClass.class 的写法.
      println("name = " + myout.name
        + " age =" + myout.sal)
    }
    //屏蔽 内外部的影响
    def test(cla:ScalaOuterClass#ScalaInnerClass): Unit ={
      println(1)
    }
  }

  var name: String = "scott"
  private var sal: Double = 1.2

}

