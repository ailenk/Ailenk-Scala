package ink.bignose.chapter17.decorator.mydecorator

import com.bignose.chapter17.decorator.Drink
import ink.bignose.chapter17.decorator.Drink

/**
  * @Author :Ailenk
  * @Date: 2017/7/14 20:31
  */
//这个是单品 coffee 在装饰着设计模式是concrete
class Chocolate(obj:Drink) extends Decorator(obj){
  super.setDescription("Chocolate")
  super.setPrice(1.0f)

}
