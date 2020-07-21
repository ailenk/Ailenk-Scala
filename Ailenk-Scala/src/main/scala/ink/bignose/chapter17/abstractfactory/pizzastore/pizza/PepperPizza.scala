package ink.bignose.chapter17.abstractfactory.pizzastore.pizza

/**
  * @Author :Ailenk
  * @Date: 2017/7/13 19:35
  */
class PepperPizza extends Pizza { //写
  override def prepare(): Unit = {
    this.name = "胡椒pizza"
    println(this.name + " preparing..")
  }
}

