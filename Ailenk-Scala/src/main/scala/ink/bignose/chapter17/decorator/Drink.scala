package ink.bignose.chapter17.decorator

/**
  * @Author :Ailenk
  * @Date: 2017/7/14 20:25
  */
// 一个抽象类
abstract class Drink {
  var description = ""
  private var price = 0.0f

  def setDescription(description: String): Unit = {
    this.description = description
  }

  def getDescription(): String = {
    description + "价格 " + this.getPrice()
  }

  def getPrice(): Float = {
    price
  }

  def setPrice(price: Float): Unit = {
    this.price=price

  }

  //将计算成本的方法 做成一个抽象方法
  def cost(): Float


}
