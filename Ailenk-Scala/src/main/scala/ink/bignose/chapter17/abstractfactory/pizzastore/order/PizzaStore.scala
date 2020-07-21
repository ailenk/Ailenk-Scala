package ink.bignose.chapter17.abstractfactory.pizzastore.order

/**
  * @Author :Ailenk
  * @Date: 2017/7/13 19:38
  */
object PizzaStore {
  //工厂方法模式来编写的
  def main(args: Array[String]): Unit = {
    new OrderPizza(new BJFactory)
  }
}
