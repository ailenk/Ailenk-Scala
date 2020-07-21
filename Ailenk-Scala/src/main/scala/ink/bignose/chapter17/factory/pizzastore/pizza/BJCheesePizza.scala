package ink.bignose.chapter17.factory.pizzastore.pizza

/**
  * @Author :Ailenk
  * @Date: 2017/7/13 19:46
  */
//新增 写
class BJCheesePizza extends Pizza{
  override def prepare(): Unit = {
    this.name = "北京奶酪pizza"
    println(this.name + " preparing..")
  }
}

