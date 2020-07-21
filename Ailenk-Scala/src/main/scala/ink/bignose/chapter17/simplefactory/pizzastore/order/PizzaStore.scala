package ink.bignose.chapter17.simplefactory.pizzastore.order

/**
  * @Author :Ailenk
  * @Date: 2017/7/13 19:38
  */
object PizzaStore {
  //ocp 原则违背
  def main(args: Array[String]): Unit = {
    new OrderPizza
  }
}
