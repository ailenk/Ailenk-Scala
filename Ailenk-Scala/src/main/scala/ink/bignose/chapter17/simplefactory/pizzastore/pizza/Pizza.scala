package ink.bignose.chapter17.simplefactory.pizzastore.pizza

/**
  * @Author :Ailenk
  * @Date: 2017/7/13 19:34
  */
abstract class Pizza { //写
  var name: String = _

  //假定，每种pizza 的准备原材料不同，因此做成抽象的..
  // 没有实现
  def prepare()

  def cut(): Unit = {
    println(this.name + " cutting ..")
  }

  def bake(): Unit = {
    println(this.name + " baking ..")
  }

  def box(): Unit = {
    println(this.name + " boxing ..")
  }
}

