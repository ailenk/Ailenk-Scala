package ink.bignose.chapter06.demo

object CatDemo {
  def main(args: Array[String]): Unit = {
    val cat = new Cat
    cat.name = "小白"
    cat.age = 10
    cat.color = "白色"

    printf("\n小猫信息如下:%s,%d,%s",cat.name, cat.age,cat.color)
  }
}

//生成。class 文件 默认public
class Cat {
  //定义声明三个属性
  //属性不给默认值 是错的
  //1.当我们声明了一个var String class 在底层会对应生成 private
  //2. 同时会生成 会生成两个  public 函数 一个方法 是 name()==getter
  //3.name_$eq ==> setter
  var name: String = ""
  var age: Int = 0
  var color: String = ""
}
