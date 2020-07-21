package ink.bignose.chapter17.abstractfactory.pizzastore.pizza

/**
  * @Author :Ailenk
  * @Date: 2017/7/13 19:46
  */
//新增 写
class BJPepperPizza extends Pizza{
  override def prepare(): Unit = {
    this.name = "北京胡椒pizza"
    println(this.name + " preparing..")
  }
}

