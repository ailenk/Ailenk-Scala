package ink.bignose.chapter17.decorator.mydecorator

import com.bignose.chapter17.decorator.Drink
import ink.bignose.chapter17.decorator.Drink

/**
  * @Author :Ailenk
  * @Date: 2017/7/14 20:38
  */
class Decorator extends Drink {

  private var obj: Drink = null

  // obj 被装饰着
  def this(obj: Drink) {
    this
    this.obj = obj
  }

  // 这里我们实现了 cost方法
  override def cost(): Float = {
    super.getPrice() + obj.cost()
  }

  override def getDescription(): String = {
    super.getDescription() + "&&" + obj.getDescription()
  }

}
