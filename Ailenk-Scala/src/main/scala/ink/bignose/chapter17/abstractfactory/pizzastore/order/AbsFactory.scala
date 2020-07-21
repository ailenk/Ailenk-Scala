package ink.bignose.chapter17.abstractfactory.pizzastore.order

import com.bignose.chapter17.abstractfactory.pizzastore.pizza.Pizza
import ink.bignose.chapter17.abstractfactory.pizzastore.pizza.Pizza

/**
  * @Author :Ailenk
  * @Date: 2017/7/13 20:26
  */
trait AbsFactory {
  def createPizza(t: String): Pizza

}
