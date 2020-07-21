package ink.bignose.chapter17.abstractfactory.pizzastore.pizza

/**
  * @Author :Ailenk
  * @Date: 2017/7/13 19:34
  */
class GreekPizza extends Pizza {
  override def prepare(): Unit = {
    this.name = "希腊披萨"
    println(this.name+"希腊披萨正在准备.....")
  }
}
