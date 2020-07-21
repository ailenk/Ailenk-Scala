package ink.bignose.chapter17.decorator.mycoffee

import ink.bignose.chapter17.decorator.Drink

/**
  * @Author :Ailenk
  * @Date: 2017/7/14 20:32
  */
// 做一个缓冲层
class Coffee extends Drink{
  override def cost(): Float = {
    super.getPrice()
  }
}
